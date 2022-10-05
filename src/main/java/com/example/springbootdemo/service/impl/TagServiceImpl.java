package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.base.service.impl.BaseServiceImpl;
import com.example.springbootdemo.entity.Tag;
import com.example.springbootdemo.repository.TagRepository;
import com.example.springbootdemo.service.TagService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class TagServiceImpl extends BaseServiceImpl<Tag,Long, TagRepository> implements TagService {

    public TagServiceImpl(TagRepository repository) {
        super(repository);
    }
}
