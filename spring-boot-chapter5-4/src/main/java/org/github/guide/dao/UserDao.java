package org.github.guide.dao;

import org.github.guide.domain.User;
import org.github.guide.mappper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by R on 2016/12/9.
 */
@Repository
public class UserDao {

   @Autowired
   private UserMapper userMapper;

   public int insertUser(String username, String password){
       return userMapper.insertUser(username, password);
   }

   public int insertUserWithBackId(User user){
        return userMapper.insertUserWithBackId(user);
   }
}
