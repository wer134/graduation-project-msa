package com.msa.gradproject.servicea;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Service A (Port 8081)!";
    }

    @GetMapping("/data")
    public String getData() {
        return "Data from Service A (Port 8081)!";
    }
}
