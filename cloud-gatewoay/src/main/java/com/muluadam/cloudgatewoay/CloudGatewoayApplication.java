package com.muluadam.cloudgatewoay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudGatewoayApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudGatewoayApplication.class, args);
    }

}
