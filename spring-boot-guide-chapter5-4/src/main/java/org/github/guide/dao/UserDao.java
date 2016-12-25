package org.github.guide.dao;

import org.github.guide.domain.User;
import org.github.guide.mappper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by R on 2016/12/9.
 */
@Repository
//@Transactional(value = "true")
public class UserDao {

   @Autowired
   private UserMapper userMapper;

   public int insertUser(String username, String password){
       return userMapper.insertUser(username, password);
   }

   public int insertUserWithBackId(User user){
        return userMapper.insertUserWithBackId(user);
   }

   public List<Object> find() {
      return userMapper.find();
   }
}
