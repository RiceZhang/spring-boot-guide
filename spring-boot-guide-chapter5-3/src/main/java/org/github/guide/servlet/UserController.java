package org.github.guide.servlet;

import org.github.guide.bean.User;
import org.github.guide.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by R on 2016/12/7.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 登录
     */
    @RequestMapping (value = "login", method = RequestMethod.POST,produces="application/json;charset=UTF-8")
    public ResponseEntity<String> login(HttpServletRequest request, HttpServletResponse response, @ModelAttribute User user){
        return userService.login(request, response, user);
    }
}
