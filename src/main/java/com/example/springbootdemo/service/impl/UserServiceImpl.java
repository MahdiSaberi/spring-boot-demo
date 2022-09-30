package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.base.service.impl.BaseServiceImpl;
import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.repository.UserRepository;
import com.example.springbootdemo.service.UserService;
import com.example.springbootdemo.service.dto.UserSearch;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImpl extends BaseServiceImpl<User,Long, UserRepository> implements UserService {

    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public User getByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public List<User> findAllByAdvanceSearch(UserSearch userSearch){
        return repository.findAll((root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();
            
            setFirstNameInPredicate(predicates, root, criteriaBuilder,userSearch.getFirstName());
            setLastNameInPredicate(predicates, root, criteriaBuilder,userSearch.getLastName());
            setUserNameInPredicate(predicates, root, criteriaBuilder,userSearch.getUsername());
            setPasswordInPredicate(predicates, root, criteriaBuilder,userSearch.getUsername());

            
            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        });
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public void printUser(){
        findAll().forEach(System.out::println);
    }



    private void setFirstNameInPredicate(List<Predicate> predicates, Root<User> root,
                                         CriteriaBuilder criteriaBuilder, String firstName) {
                if(firstName != null)
                    predicates.add(criteriaBuilder.like(root.get("firstName"),"%" + firstName + "%"));
    }

    private void setLastNameInPredicate(List<Predicate> predicates, Root<User> root,
                                        CriteriaBuilder criteriaBuilder, String lastName) {
        if(lastName != null)
            predicates.add(criteriaBuilder.like(root.get("lastName"),"%" + lastName + "%"));
    }



    private void setUserNameInPredicate(List<Predicate> predicates, Root<User> root,
                                        CriteriaBuilder criteriaBuilder, String username) {
        if(username != null)
           predicates.add(criteriaBuilder.like(root.get("username"),"%" + username + "%"));
    }

    private void setPasswordInPredicate(List<Predicate> predicates, Root<User> root,
                                        CriteriaBuilder criteriaBuilder, String password) {
        if(password != null)
            predicates.add(criteriaBuilder.like(root.get("password"),"%" + password + "%"));
    }

}
