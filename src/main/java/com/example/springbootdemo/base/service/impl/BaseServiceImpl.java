package com.example.springbootdemo.base.service.impl;

import com.example.springbootdemo.base.entity.BaseEntity;
import com.example.springbootdemo.base.repository.BaseRepository;
import com.example.springbootdemo.base.service.BaseService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional(readOnly = true)
public class BaseServiceImpl<E extends BaseEntity<ID>,ID extends Serializable, R extends BaseRepository<E,ID>>
        implements BaseService<E,ID> {

    protected final R repository;


    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public E save(E e) {
        return repository.save(e);
    }

    @Override
    public long count() {
        return repository.count();
    }

    @Override
    @Transactional
    public void deleteById(ID id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional
    public Page findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    @Transactional
    public E findById(ID id) {
        return repository.findById(id).get();
    }
}
