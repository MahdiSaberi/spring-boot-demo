package com.example.springbootdemo;

import com.example.springbootdemo.entity.Address;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.repository.UserRepository;
import com.example.springbootdemo.service.UserService;
import com.example.springbootdemo.service.dto.UserSearch;
import com.example.springbootdemo.service.impl.UserServiceImpl;
import com.github.javafaker.Faker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import javax.persistence.criteria.Predicate;
import java.util.*;
import java.util.stream.IntStream;

@SpringBootApplication
public class SpringBootDemoApplication {

    private static Faker faker = new Faker();

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);


    }

}
