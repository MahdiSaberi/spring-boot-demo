package com.example.springbootdemo.service.dto;

import com.example.springbootdemo.base.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TagDTO extends BaseDTO<Long> {
    private String title;
}
