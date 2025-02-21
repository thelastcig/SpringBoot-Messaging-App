package com.messaging.app;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloWorld {

    @GetMapping(value = {"/", "/hello"})
    public String hello(){
        return "Hello from BridgeLabz!";
    }
    
}
