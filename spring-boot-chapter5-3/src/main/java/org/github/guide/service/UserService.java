package org.github.guide.service;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.github.guide.bean.User;
import org.github.guide.config.Constant;
import org.github.guide.util.JwtUtil;
import org.github.guide.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by R on 2016/12/7.
 */
@Component
public class UserService {

    private static final Logger logger = LogManager.getLogger(UserService.class);

    @Autowired
    private JwtUtil jwt;

    public ResponseEntity<String> login(HttpServletRequest request, HttpServletResponse response, User user){
        try {
            if(!"admin".equals(user.getAccount()) || !"123456".equals(user.getPwd())){
                return ResponseUtil.exception("账号或者密码错误");
            }
            user.setRoleId(1L);
            String subject = JwtUtil.generalSubject(user); // 类似shiro 的 subject
            String token = jwt.createJWT(Constant.JWT_ID, subject, Constant.JWT_TTL);
            String refreshToken = jwt.createJWT(Constant.JWT_ID, subject, Constant.JWT_REFRESH_TTL);
            JSONObject jo = new JSONObject();
            jo.put("token", token);
            jo.put("refreshToken", refreshToken);
            return ResponseUtil.success(jo);
        } catch (Exception e) {
            logger.error(e);
            return ResponseUtil.unKonwException();
        }
    }
}
