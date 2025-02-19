package com.app.controller;

import com.app.client.WelcomeFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {

    @Autowired
    private WelcomeFeignClient feignClient;

    @GetMapping("/greet")
    public String greetMethod() {
        String welcome = feignClient.getWelcomeMsg();
        String greet = "Hola, buenos dias!!! ";

        return greet + welcome;
    }
}
