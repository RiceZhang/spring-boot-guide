package org.github.guide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 消费者服务
 *
 * Created by R on 2017/1/3.
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo.xml"})
public class Application {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(Application.class, args);
    }

}
