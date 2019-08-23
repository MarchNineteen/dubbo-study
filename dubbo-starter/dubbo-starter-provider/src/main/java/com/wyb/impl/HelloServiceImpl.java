package com.wyb.impl;

import com.wyb.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author Marcher丶
 */
@Service(version = "${demo.service.version}")
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String message) {
        return "hello_" + message;
    }
}
