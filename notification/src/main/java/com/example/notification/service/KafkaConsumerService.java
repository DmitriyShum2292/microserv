package com.example.notification.service;

import com.example.notification.model.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private Logger logger = LoggerFactory.getLogger(KafkaConsumerService.class);


    @KafkaListener(
            topics = "reflectoring-1",
            groupId="reflectoring-1",
            containerFactory="userKafkaListenerContainerFactory")
    void listener(Customer user) {
        logger.info("CustomUserListener [{}]", user);
    }
}
