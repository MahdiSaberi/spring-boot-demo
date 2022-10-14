package com.example.springbootdemo.base.mapper;

import com.example.springbootdemo.base.dto.BaseDTO;
import com.example.springbootdemo.base.entity.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper <E extends BaseEntity<ID>, D extends BaseDTO<ID>, ID extends Serializable>{

    E convertDTOToEntity(D d);

    D convertEntityToDTO(E e);

    List<E> convertListDTOToEntityList(List<D> dtoList);

    List<D> convertListEntityToDTOList(List<E> entityList);
}
