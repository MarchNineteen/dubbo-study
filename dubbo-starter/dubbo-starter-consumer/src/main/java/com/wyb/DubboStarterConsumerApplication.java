package com.wyb;

import com.wyb.api.HelloService;
import com.wyb.controller.HelloController;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DubboStarterConsumerApplication {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Reference(version = "${demo.service.version}")
	private HelloService helloService;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DubboStarterConsumerApplication.class, args);
		HelloController controller = context.getBean("helloController", HelloController.class);
		System.out.println(controller.sayHello("world"));
	}

	@Bean
	public ApplicationRunner runner() {
		return args -> logger.info(helloService.hello("11"));
	}
}
