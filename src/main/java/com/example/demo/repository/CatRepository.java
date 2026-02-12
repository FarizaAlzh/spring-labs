package com.example.demo.repository;

import com.example.demo.domain.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CatRepository extends JpaRepository<Cat, Long> { // .save() и .findAll()
}




