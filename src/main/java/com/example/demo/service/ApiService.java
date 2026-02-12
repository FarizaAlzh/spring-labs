package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class ApiService {
    private final RestTemplate restTemplate;

    // конструктор через него spring даст нам RestTemplate
    public ApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Map<String, Object> getExternalData() {
        String url = "https://catfact.ninja/fact"; // внешний API
        return restTemplate.getForObject(url, Map.class); // cкачиваем данные
    }
}

