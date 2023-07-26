package com.example.customer.service;


import com.example.customer.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SendRequestService {

    private Logger logger = LoggerFactory.getLogger(SendRequestService.class);

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate1;

    public void sendCheckFraud(Customer customer) {
        HttpEntity<Customer> entity = new HttpEntity<>(customer);
        ResponseEntity entity1 = restTemplate1.postForEntity("http://FRAUD/api/v1/fraud/",entity, Customer.class);
//                .postForObject("http://FRAUD/api/v1/fraud/",customer, Customer.class);
//        logger.info("Response status: " + customer1);
    }
}
