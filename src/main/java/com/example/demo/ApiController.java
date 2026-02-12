package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api") // Все начинаться с /api = http://localhost:8080/api/
public class ApiController {

    //  Part 3.1: GET Endpoint
    @GetMapping("/info") //  GET запрос
    public Map<String, Object> getInfo() {
        return Map.of(
                "student", "Alzhan Fariza",
                "course", "Spring Framework",
                "week", 1
        );
    }

    // Part 3.2: POST Endpoint
    @PostMapping("/calculate") //  POST запрос
    public Map<String, Integer> calculate(@RequestBody Map<String, Integer> request) {

        Integer a = request.get("a");
        Integer b = request.get("b");

        return Map.of("result", a + b);
    }
}

