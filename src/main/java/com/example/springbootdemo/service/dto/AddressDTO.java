package com.example.springbootdemo.service.dto;

import com.example.springbootdemo.base.dto.BaseDTO;
import com.example.springbootdemo.base.entity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO extends BaseDTO<Long> {

    private String address;
    public String postalCode;
}