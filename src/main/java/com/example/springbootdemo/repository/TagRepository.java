package com.example.springbootdemo.repository;

import com.example.springbootdemo.base.repository.BaseRepository;
import com.example.springbootdemo.entity.Tag;
import org.springframework.stereotype.Repository;


public interface TagRepository extends BaseRepository<Tag,Long> {
}
