package com.example.demo3.user.domain;

import com.example.demo3.user.dto.UserRequestDto;
import com.example.demo3.util.Timestampded;
import lombok.Getter;

import javax.persistence.*;


@Getter
@Table(name="users")
@Entity
public class User extends Timestampded {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int code;
    private String userName;
    private String password;
    private String firstName;
    private String email;



    public User(UserRequestDto userDto) {
        this.userName = userDto.getUserName();
        this.password = userDto.getPassword();
        this.firstName = userDto.getFirstName();
        this.email = userDto.getEmail();

    }

    public User() {

    }


    public void update(UserRequestDto userDto) {

    }
}