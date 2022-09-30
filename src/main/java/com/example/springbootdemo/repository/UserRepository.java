package com.example.springbootdemo.repository;

import com.example.springbootdemo.base.repository.BaseRepository;
import com.example.springbootdemo.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends BaseRepository<User,Long> {

    User findByUsernameAndPassword(String username,String password);

    @Query("select u from User u where u.username =: username")
    User findByUsername(@Param("username") String username);

    @Override
    Page<User> findAll(Specification<User> spec, Pageable pageable);
}
