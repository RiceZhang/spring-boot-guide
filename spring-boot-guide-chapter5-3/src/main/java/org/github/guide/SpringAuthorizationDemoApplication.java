package org.github.guide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * Created by R on 2016/12/7.
 */
@ServletComponentScan
@SpringBootApplication
public class SpringAuthorizationDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthorizationDemoApplication.class, args);
    }

}