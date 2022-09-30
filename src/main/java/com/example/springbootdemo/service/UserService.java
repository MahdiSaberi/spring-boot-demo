package com.example.springbootdemo.service;

import com.example.springbootdemo.base.service.BaseService;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.dto.UserSearch;

import java.util.List;

public interface UserService extends BaseService<User,Long> {

    User getByUsername(String username);

    List<User> findAllByAdvanceSearch(UserSearch userSearch);
}
