package com.example.demo3.user.dto;

import com.example.demo3.user.domain.User;

import javax.persistence.Id;
import java.sql.Timestamp;

public class UserResponseDto {
    @Id
    private int code;
    private String userName;
    private String firstName;
    private String email;
    private Timestamp regDate;
    private Timestamp modDate;

//    public class UserResponseDto(String userName, String firstName,String email, Timestamp regDate,Timestamp modDate) {
//
//    }

    public UserResponseDto (User user) {
        this.code = user.getCode();
        this.userName = user.getUserName();
        this.firstName = user.getFirstName();
        this.email = user.getEmail();
        this.regDate = user.getRegDate();
        this.modDate = user.getModDate();
    }
}
