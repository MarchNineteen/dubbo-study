package com.wyb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:provider.xml")
public class DubboXmlProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboXmlProviderApplication.class, args);
    }

}
