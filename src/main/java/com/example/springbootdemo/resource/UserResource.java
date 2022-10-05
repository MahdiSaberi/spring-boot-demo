package com.example.springbootdemo.resource;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.UserService;
import com.example.springbootdemo.service.dto.UserSearch;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserResource {

    private final UserService userService;

//    /user?id=7
    @GetMapping
    public User getById(@RequestParam Long id){
        return userService.findById(id);
    }

    @GetMapping("/{id}")
    public User getByIdPath(@PathVariable Long id){
        return userService.findById(id);
    }

    @GetMapping("/search")
    public List<User> search(@RequestBody UserSearch userSearch){
        return userService.findAllByAdvanceSearch(userSearch);
    }

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return userService.save(user);
    }
}
