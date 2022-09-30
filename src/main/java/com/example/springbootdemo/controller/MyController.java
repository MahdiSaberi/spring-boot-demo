package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
@RequiredArgsConstructor
public class MyController {

    private final UserRepository userRepository;

    @GetMapping
    public String myHome(){
        userRepository.save(new User("mohsen","talaati","mositali","1234"));
        return "home";
    }
}
