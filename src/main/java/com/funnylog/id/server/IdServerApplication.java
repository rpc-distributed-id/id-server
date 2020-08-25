package com.funnylog.id.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author FangYunLong
 * on 2020/8/24
 */
@EnableDiscoveryClient
@SpringBootApplication
public class IdServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(IdServerApplication.class, args);
    }
}
