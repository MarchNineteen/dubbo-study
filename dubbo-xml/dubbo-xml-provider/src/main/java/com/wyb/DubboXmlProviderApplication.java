package com.wyb;

import com.wyb.api.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
@ImportResource(locations = "classpath:provider.xml")
public class DubboXmlProviderApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DubboXmlProviderApplication.class, args);

//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
//        context.start();
//        System.in.read();
    }

}
