package org.github.guide.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by R on 2016/12/4.
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "index";
    }

}
