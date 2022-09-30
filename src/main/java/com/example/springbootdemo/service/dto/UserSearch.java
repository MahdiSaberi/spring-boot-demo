package com.example.springbootdemo.service.dto;

import com.example.springbootdemo.base.entity.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserSearch {

    private String firstName;
    private String lastName;

    private String username;

    private String password;
}