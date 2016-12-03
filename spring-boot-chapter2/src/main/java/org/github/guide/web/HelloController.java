package org.github.guide.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by R on 2016/12/3.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

}
