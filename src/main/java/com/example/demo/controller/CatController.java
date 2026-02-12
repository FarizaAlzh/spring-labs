package com.example.demo.controller;

import com.example.demo.domain.Cat;
import com.example.demo.repository.CatRepository;
import org.springframework.web.bind.annotation.*;
        import java.util.List;

@RestController
@RequestMapping("/api/cats")
public class CatController {

    private final CatRepository catRepository;

    public CatController(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    @GetMapping
    public List<Cat> getAll() {
        return catRepository.findAll();
    }

    @PostMapping
    public Cat create(@RequestBody Cat cat) {
        return catRepository.save(cat);
    }

}