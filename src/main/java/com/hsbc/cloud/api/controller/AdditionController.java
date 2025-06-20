package com.hsbc.cloud.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AdditionController {

    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return a + b;
    }
}
