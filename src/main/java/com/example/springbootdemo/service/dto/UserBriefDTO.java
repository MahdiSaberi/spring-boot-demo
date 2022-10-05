package com.example.springbootdemo.service.dto;

import com.example.springbootdemo.base.dto.BaseDTO;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class UserBriefDTO extends BaseDTO<Long> {

    private String firstName;
    private String lastName;

//    private Set<AddressDTO> addressSet;

}
