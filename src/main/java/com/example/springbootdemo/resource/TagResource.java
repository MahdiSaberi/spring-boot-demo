package com.example.springbootdemo.resource;

import com.example.springbootdemo.base.resource.BaseResource;
import com.example.springbootdemo.entity.Tag;
import com.example.springbootdemo.mapper.TagMapper;
import com.example.springbootdemo.service.TagService;
import com.example.springbootdemo.service.dto.TagDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tag")
public class TagResource extends BaseResource<Tag, TagDTO, Long, TagService, TagMapper> {

//    private final TagService tagService;
//
//    private final TagMapper tagMapper;

    public TagResource(TagService baseService, TagMapper baseMapper) {
        super(baseService, baseMapper);
    }

}
