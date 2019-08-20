package com.wyb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:consumer.xml")
public class DubboXmlConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboXmlConsumerApplication.class, args);
//        ConfigurableApplicationContext context = SpringApplication.run(DubboXmlConsumerApplication.class, args);

    }

}
