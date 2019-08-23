package com.wyb;

import com.wyb.controller.ConsumerController;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
        ConsumerController controller = context.getBean("consumerController", ConsumerController.class);
        System.out.println(controller.sayHello("world"));
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "com.wyb.controller")
    @PropertySource("classpath:/dubbo-consumer.properties")
    static class ConsumerConfiguration {

    }
}
