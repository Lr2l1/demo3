package com.example.demo3.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class UserRequestDto {
    private int code;
    private String userName;
    private String password;
    private String firstName;
    private String email;
    private Timestamp regDate;
    private Timestamp modDate;
}
