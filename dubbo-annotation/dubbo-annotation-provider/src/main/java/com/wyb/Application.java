package com.wyb;

import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.io.IOException;

@SpringBootApplication
@PropertySource("classpath:/dubbo-provider.properties")
@EnableDubbo(scanBasePackages = "com.wyb.service.impl")
public class Application {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(Application.class, args);
        System.in.read();
    }

    @Configuration
    static class ProviderConfiguration {
        @Bean
        public RegistryConfig registryConfig() {
            RegistryConfig registryConfig = new RegistryConfig();
            registryConfig.setAddress("zookeeper://127.0.0.1:2181");
            return registryConfig;
        }
    }
}
