package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.ApiService;

import java.util.Map;

@RestController
@RequestMapping("/api")

public class DataController {
    private final ApiService apiService;

    // Part 2: Constructor Injection
    // мы просим его у Spring
    public DataController(ApiService apiService) {
        this.apiService = apiService;
    }

    @GetMapping("/data")
    public Map<String, Object> getData() {
        return apiService.getExternalData();
    }
}
