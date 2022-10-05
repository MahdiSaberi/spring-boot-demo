package com.example.springbootdemo.base.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseService<E,ID> {
    E save(E e);
    long count();
    void deleteById(ID id);
    Page findAll(Pageable pageable);
    E findById(ID id);
}
