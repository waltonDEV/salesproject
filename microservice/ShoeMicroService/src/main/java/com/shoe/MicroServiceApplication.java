package com.shoe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.shoe.mapper")
public class MicroServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(MicroServiceApplication.class).web(true).run(args);
    }

}
