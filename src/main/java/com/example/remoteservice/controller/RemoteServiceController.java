package com.example.remoteservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RemoteServiceController {

    private final Random random = new Random();

    @GetMapping("/remoteService")
    public String remoteService() {
        // Simulate service being unavailable with a 50% chance
        if (random.nextBoolean()) {
            throw new RuntimeException("Service unavailable");
        }

        // Simulate service being available
        return "Response from Remote Service!";
    }
}
