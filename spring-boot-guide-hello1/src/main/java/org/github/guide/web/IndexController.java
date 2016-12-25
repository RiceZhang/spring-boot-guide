package org.github.guide.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by R on 2016/11/30.
 */
@Controller
public class IndexController {

    /**
     * @api {get} /user/:id Request User information
     * @apiName GetUser
     * @apiGroup User
     * @apiParam {Number} id Users unique ID.
     * @apiSuccess {String} firstname Firstname of the User.
     * @apiSuccess {String} lastname  Lastname of the User.
     */
    @RequestMapping(value={"", "/", "index"})
    public String index() {
        return "index.jsp";
    }

    /**
     * @api {get} /hello
     * @apiName GetUser
     * @apiGroup User
     *
     * @apiParam {Number} id Users unique ID.
     *
     * @apiSuccess {String} firstname Firstname of the User.
     * @apiSuccess {String} lastname  Lastname of the User.
     */
    @RequestMapping(value="hello")
    public @ResponseBody String hello() {
        return "hello";
    }

}
