package com.example.springbootdemo.mapper;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.dto.UserBriefDTO;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserBriefDTO convertUserToBriefDTO(User user);
}
