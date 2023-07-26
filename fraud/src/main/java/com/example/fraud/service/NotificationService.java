package com.example.fraud.service;

import com.example.fraud.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private KafkaTemplate<String, Customer> kafkaTemplate;

    public void send(Customer customer) {
        kafkaTemplate.send("reflectoring-1", customer);
    }

}
