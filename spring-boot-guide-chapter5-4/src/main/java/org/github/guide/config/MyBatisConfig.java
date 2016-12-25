package org.github.guide.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;

import org.github.guide.utils.DESUtils;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by R on 2016/12/8.
 */
@Configuration    //该注解类似于spring配置文件
@MapperScan(basePackages="org.github.guide.mappper")
public class MyBatisConfig {

    private static Logger logger = LoggerFactory.getLogger(MyBatisConfig.class);

     @Autowired
     private Environment env;

    /**
     * 通过环境变量， 读取外部配置文件的密码
     * @return
     * @throws Exception
     */
     @Bean
     //@Primary
     public DataSource getDataSource() throws Exception{
           Properties props = new Properties();
           props.put("driverClassName", env.getProperty("jdbc.driverClassName"));
           props.put("url", env.getProperty("jdbc.url"));
           props.put("username", DESUtils.decode(env.getProperty("jdbc.username")));
           props.put("password", DESUtils.decode(env.getProperty("jdbc.password")));

           return DruidDataSourceFactory.createDataSource(props);
     }

     @Bean
     public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception{
           SqlSessionFactoryBean fb = new SqlSessionFactoryBean();
           fb.setDataSource(ds);//指定数据源(这个必须有，否则报错)
           //下边两句仅仅用于*.xml文件，如果整个持久层操作不需要使用到xml文件的话（只用注解就可以搞定），则不加
           fb.setTypeAliasesPackage(env.getProperty("mybatis.typeAliasesPackage"));//指定基包
           fb.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybatis.mapperLocations")));//指定xml文件位置
           return fb.getObject();
      }

}
