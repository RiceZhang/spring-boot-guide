package org.github.guide.controller;

import io.swagger.annotations.*;
import org.github.guide.domain.User;
import org.github.guide.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by R on 2016/12/9.
 */
@RestController
@RequestMapping("/user")
@Api("userController相关api")
public class UserController {

     @Autowired
     private UserService userService;

     @ApiOperation("添加用户")
     @ApiImplicitParams({
          @ApiImplicitParam(paramType="query",name="username",dataType="String",required=true,value="用户的姓名",defaultValue="zhaojigang"),
          @ApiImplicitParam(paramType="query",name="password",dataType="String",required=true,value="用户的密码",defaultValue="wangna")
     })
     @ApiResponses({
          @ApiResponse(code=400,message="请求参数没填好"),
          @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
     })
     @RequestMapping(value="/addUser",method= RequestMethod.POST)
     public boolean addUser(@RequestParam("username") String username,
                            @RequestParam("password") String password) {
          return userService.addUser(username,password);
     }

     @ApiOperation("添加用户且返回已经设置了主键的user实例")
     @ApiImplicitParams({
          @ApiImplicitParam(paramType="query",name="username",dataType="String",required=true,value="用户的姓名",defaultValue="zhaojigang"),
          @ApiImplicitParam(paramType="query",name="password",dataType="String",required=true,value="用户的密码",defaultValue="wangna")
     })
     @ApiResponses({
           @ApiResponse(code=400,message="请求参数没填好"),
           @ApiResponse(code=404,message="请求路径没有或页面跳转路径不对")
     })
     @RequestMapping(value="/addUserWithBackId",method=RequestMethod.POST)
     public User addUserWithBackId(@RequestParam("username") String username,
                                   @RequestParam("password") String password) {
          return userService.addUserWithBackId(username, password);
     }

}
