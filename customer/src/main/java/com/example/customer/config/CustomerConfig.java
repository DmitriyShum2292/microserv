package com.example.customer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerConfig {

    @Bean("testBean")
    @LoadBalanced
    public RestTemplate restTemplate1() {
        return new RestTemplate();
    }
}
