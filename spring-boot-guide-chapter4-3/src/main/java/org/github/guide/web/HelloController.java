package org.github.guide.web;

import org.springframework.web.bind.annotation.*;

/**
 * Created by R on 2016/12/27.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello " + name;
    }

}
