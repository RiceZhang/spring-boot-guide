package org.github.guide.mappper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.github.guide.domain.User;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

/**
 * Created by R on 2016/12/8.
 */
public interface UserMapper {

    @Select("select * from sys_user")
    public List<Object> find();

    @Insert("INSERT INTO tb_user(username, password) VALUES(#{username},#{password})")
    public int insertUser(@Param("username") String username, @Param("password")  String password);

    public int insertUserWithBackId(User user);

}
