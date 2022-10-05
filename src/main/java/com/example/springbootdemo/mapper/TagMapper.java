package com.example.springbootdemo.mapper;

import com.example.springbootdemo.base.mapper.BaseMapper;
import com.example.springbootdemo.entity.Tag;
import com.example.springbootdemo.service.dto.TagDTO;
import org.mapstruct.Mapper;

@Mapper
public interface TagMapper extends BaseMapper<Tag, TagDTO, Long> {
}
