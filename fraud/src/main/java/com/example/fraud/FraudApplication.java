package com.example.fraud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FraudApplication {

    private Logger logger = LoggerFactory.getLogger(FraudApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FraudApplication.class);
    }


}
