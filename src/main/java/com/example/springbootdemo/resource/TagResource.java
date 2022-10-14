package com.example.springbootdemo.resource;

import com.example.springbootdemo.base.resource.BaseResource;
import com.example.springbootdemo.entity.Tag;
import com.example.springbootdemo.mapper.TagMapper;
import com.example.springbootdemo.service.TagService;
import com.example.springbootdemo.service.dto.TagDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tag")
@RequiredArgsConstructor
public class TagResource {

    private final TagService tagService;

    private final TagMapper tagMapper;

    @PostMapping("/save")
    public TagDTO save(@RequestBody Tag tag){
        tagService.save(tag);
        TagDTO tagDTO = tagMapper.convertEntityToDTO(tag);
        return tagDTO;
    }

    @GetMapping
    public Tag viewTagById(@RequestParam Long id){
        return tagService.findById(id);
    }

    @GetMapping("/{id}")
    public Tag viewTag(@PathVariable Long id){
        return tagService.findById(id);
    }

    @GetMapping("/list")
    public List<Tag> viewTagList(){
        return tagService.findAll();
    }

}
