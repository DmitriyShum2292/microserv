package com.example.customer.controller;


import com.example.customer.model.Customer;
import com.example.customer.service.SendRequestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

    @Autowired
    private SendRequestService sendRequestService;



    private Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @PostMapping
    public ResponseEntity registerCustomer(@RequestBody Customer customer) {
        logger.info("Customer: " + customer);
        sendRequestService.sendCheckFraud(customer);
        return new ResponseEntity("OK", HttpStatus.OK);
    }
}
