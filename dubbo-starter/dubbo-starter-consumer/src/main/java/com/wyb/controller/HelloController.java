package com.wyb.controller;

import com.wyb.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
/**
 * @author Marcher丶
 */
@Component
public class HelloController {

    @Reference(version = "${demo.service.version}")
    private HelloService helloService;

    public String sayHello(String name) {
        return helloService.hello(name);
    }


}
