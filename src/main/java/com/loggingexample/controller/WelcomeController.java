package com.loggingexample.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private static final Logger logger = LogManager.getLogger(WelcomeController.class);

    @GetMapping("/name/{name}")
    public String view(@PathVariable String name){
        String request = name;
        logger.trace("This is a TRACE message : {}",request);
        logger.debug("This is a DEBUG message : {}",request);
        logger.info("This is an INFO message : {}",request);
        logger.warn("This is a WARN message : {}",request);
        logger.error("This is an ERROR message : {}",request);
        logger.fatal("This is a FATAL message : {}",request);

        String response = "WELCOME "+name+" TO 3KT";
        logger.info("RESPONSE : {}",response);
        return response;
    }

}
