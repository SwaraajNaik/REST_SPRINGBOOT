package com.MyFirstRestAPI.restSpring.RestAPIJava;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/healthcheck")
    public String healthCheck()
    {
        return "Your status seems to be up and running";
    }
}
