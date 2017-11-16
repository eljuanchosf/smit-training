package com.github.smatyukevich.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@EnableRedisHttpSession
@EnableDiscoveryClient
public class StockSpringBootStarter {
    public static void main(String[] args) {
        SpringApplication.run(StockSpringBootStarter.class, args);
    }
}
