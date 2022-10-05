package com.example.springbootdemo.resource;

import com.example.springbootdemo.entity.Address;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.UserService;
import com.example.springbootdemo.service.dto.AddressDTO;
import com.example.springbootdemo.service.dto.UserBriefDTO;
import com.example.springbootdemo.service.dto.UserSearch;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserResource {

    private final UserService userService;

    private final UserMapper userMapper;

//    /user?id=7
    @GetMapping
    public User getById(@RequestParam Long id){
        return userService.findById(id);
    }

    @GetMapping("/{id}")
    public UserBriefDTO getByIdPath(@PathVariable Long id){
        User user = userService.findById(id);
//        UserBriefDTO userBriefDTO = new UserBriefDTO();
//        BeanUtils.copyProperties(user,userBriefDTO);
        return userMapper.convertUserToBriefDTO(user);
    }

    @GetMapping("/search")
    public List<User> search(@RequestBody UserSearch userSearch){
        return userService.findAllByAdvanceSearch(userSearch);
    }

    @PostMapping("/save")
    public UserBriefDTO save(@RequestBody User user){
        user = userService.save(user);
        UserBriefDTO userBriefDTO = new UserBriefDTO();
        BeanUtils.copyProperties(user,userBriefDTO);
        return userBriefDTO;
    }
}
