package com.mytests.micronaut.test2eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer()
public class Test2EurekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Test2EurekaServiceApplication.class, args);
    }

}
