package com.example.springbootdemo.entity;

import com.example.springbootdemo.base.entity.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Data
public class Tag extends BaseEntity<Long> {
    private String title;
}
