package org.github.guide.service;

import org.github.guide.dao.UserDao;
import org.github.guide.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by R on 2016/12/9.
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean addUser(String username, String password){
       return userDao.insertUser(username, password)==1?true:false;
    }

    public User addUserWithBackId(String username, String password){
          User user = new User();
          user.setUsername(username);
          user.setPassword(password);
          userDao.insertUserWithBackId(user);//该方法后，主键已经设置到user中了
          return user;
    }
}
