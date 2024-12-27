package com.example.remoteservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RemoteServiceController {

    @GetMapping("/remoteService")
    public String remoteService() {
        return "Response from Remote Service!";
    }
}
