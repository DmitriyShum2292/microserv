package com.example.fraud.controller;


import com.example.fraud.model.Customer;
import com.example.fraud.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud")
public class FraudController {

    @Autowired
    private NotificationService notificationService;
    private Logger logger = LoggerFactory.getLogger(FraudController.class);

    @PostMapping
    public ResponseEntity fraudCheck(@RequestBody Customer customer) {
        int id = 1;
        notificationService.send(customer);
        if(customer.getId().intValue() == id) {
            logger.info("Fraud: " + customer);
            return new ResponseEntity(customer, HttpStatus.OK);
        }
        logger.info("Not Fraud: " + customer);
        return new ResponseEntity(customer, HttpStatus.OK);
    }

}
