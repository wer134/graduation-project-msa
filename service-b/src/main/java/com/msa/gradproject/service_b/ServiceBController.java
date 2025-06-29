package com.msa.gradproject.service_b; // 주의: package 이름이 service_b 입니다.

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @GetMapping("/greet")
    public String greet() {
        return "Greetings from Service B (Port 8082)!";
    }

    @GetMapping("/info")
    public String getInfo() {
        return "Info from Service B (Port 8082)!";
    }
}
