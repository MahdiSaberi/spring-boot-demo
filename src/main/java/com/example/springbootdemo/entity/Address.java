package com.example.springbootdemo.entity;


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
@Entity
public class Address extends BaseEntity<Long> {
    private String address;
    public String postalCode;
}
