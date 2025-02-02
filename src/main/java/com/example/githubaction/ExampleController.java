package com.example.githubaction;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class ExampleController {

    @GetMapping("/v1/health")
    public String health() {
        return "ok";
    }

    @GetMapping("/v1/health2")
    public String health2() {
        return "ok2 " + LocalDateTime.now();
    }

}
