package org.github.guide;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.github.guide.service.BlogProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 在Spring-boot1.4.0 中已经使用 SpringBootTest 替代  @SpringApplicationConfiguration(Application.class)
 *
 * Created by R on 2016/12/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class ApplicationTests {

    private static final Log log = LogFactory.getLog(ApplicationTests.class);

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void test1() throws Exception {
        Assert.assertEquals("zrx", blogProperties.getName());
        //Assert.assertEquals("Spring Boot guide", blogProperties.getTitle());
        //Assert.assertEquals("张日雄正在努力写《Spring Boot教程》", blogProperties.getDesc());

        log.info("随机数测试输出：");
        log.info("随机字符串 : " + blogProperties.getValue());
        log.info("随机int : " + blogProperties.getNumber());
        log.info("随机long : " + blogProperties.getBignumber());
        log.info("随机10以下 : " + blogProperties.getTest1());
        log.info("随机10-20 : " + blogProperties.getTest2());
    }

}
