package com.example.springbootdemo.entity;

import com.example.springbootdemo.base.entity.BaseEntity;
import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "user_tbl")
public class User extends BaseEntity<Long> {

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String username;

    private String password;
}
