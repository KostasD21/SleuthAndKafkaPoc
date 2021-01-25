package com.application1.sleuth.app1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.application1.sleuth.app1.service.Producer;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    private static final Logger logger = LoggerFactory.getLogger(RestController.class);

    private final Producer producer;

    public RestController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/get/{id}")
    public String getRequest(@PathVariable Long id) {
        logger.info("Path variable: {}", id);
        producer.sendMessage(String.valueOf(id));
        return "Successful request with variable: " + id;
    }

}
