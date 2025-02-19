package com.app.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Welcome-Service")
public interface WelcomeFeignClient {

    // sending GET request to the provider service
    @GetMapping("/welcome")
    public String getWelcomeMsg();
}
