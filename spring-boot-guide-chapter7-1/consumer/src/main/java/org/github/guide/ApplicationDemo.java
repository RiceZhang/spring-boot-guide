package org.github.guide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by R on 2016/12/30.
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo.xml"})
public class ApplicationDemo {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(ApplicationDemo.class, args);
    }

}
