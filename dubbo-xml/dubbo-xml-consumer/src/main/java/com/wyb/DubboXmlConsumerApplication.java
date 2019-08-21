package com.wyb;

import com.wyb.api.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
@ImportResource(locations = "classpath:consumer.xml")
public class DubboXmlConsumerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboXmlConsumerApplication.class, args);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
//        context.start();
//        HelloService demoService = context.getBean("helloService", HelloService.class);
//        String hello = demoService.hello("world");
//        System.out.println("result: " + hello);
    }

}
