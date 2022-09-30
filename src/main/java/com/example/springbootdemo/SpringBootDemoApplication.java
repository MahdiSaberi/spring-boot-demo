package com.example.springbootdemo;

import com.example.springbootdemo.entity.User;
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
import java.util.List;
import java.util.stream.IntStream;

@SpringBootApplication
public class SpringBootDemoApplication {

    private static Faker faker = new Faker();

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

        UserService userService = context.getBean(UserService.class);

        List<User> users = userService.findAllByAdvanceSearch(new UserSearch("Glenn", null, null, null));

        users.forEach(user -> {
            System.out.println(user.getFirstName());
        });


    }

}
