package com.example.githubaction;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class ExampleController {

    private final Calc calc;

    @GetMapping("/v1/health")
    public String health() {
        return "ok";
    }

    @GetMapping("/v1/health2")
    public String health2() {
        return "ok2 " + LocalDateTime.now();
    }

    @GetMapping("/v1/calc")
    public String calc(@RequestParam int a, @RequestParam int b) {
        return "result: " + calc.add(a, b);
    }

}
