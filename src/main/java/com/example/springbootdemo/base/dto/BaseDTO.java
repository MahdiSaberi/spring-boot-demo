package com.example.springbootdemo.base.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Setter
@Getter
public abstract class BaseDTO<ID extends Serializable> implements Serializable {
    
    private ID id;
}