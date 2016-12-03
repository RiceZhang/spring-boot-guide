package org.github.guide.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by R on 2016/12/3.
 */
@RestController
public class HelloController {

    @ApiIgnore
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }

}
