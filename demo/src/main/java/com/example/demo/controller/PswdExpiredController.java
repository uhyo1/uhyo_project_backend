package com.example.demo.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.PswdExpired;
import com.example.demo.repository.PswdExpiredRepository;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/expired")
public class PswdExpiredController {

    private final PswdExpiredRepository repository;

    @GetMapping("/all")
    public List<PswdExpired> getAll() {
        return repository.findAll();
    }
}