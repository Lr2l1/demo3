package com.example.demo3.user.controller;

import com.example.demo3.user.domain.User;
import com.example.demo3.user.domain.UserRepository;
import com.example.demo3.user.domain.UserService;
import com.example.demo3.user.dto.UserRequestDto;
import com.example.demo3.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @ResponseBody
    @GetMapping("/users")
    public List<User> findUserAll() {
        List<User> list = new ArrayList<>();
        list = userService.findAll();
        return list;
    }

    @ResponseBody
    @GetMapping("user")
    public User findUser( @RequestBody UserRequestDto userDto) {
        String id = userDto.getUserName();
        String password = userDto.getPassword();
        return userService.findUserByIdAndPassword(id,password);
    }

    @ResponseBody
    @GetMapping("/user/{userCode}")
    public User findByCode(@PathVariable int userCode) {

        return userService.findUserByCode(userCode);
    }

    @Transactional
    @ResponseBody
    @PostMapping("/user")
    public UserResponseDto create(@RequestBody UserRequestDto userDto) {
        return userService.createUser(userDto);
    }

//    @Transactional
//    @ResponseBody
//    @PutMapping("/update/{userCode})")
//    public User update (@PathVariable int userCode, @RequestBody UserRequestDto userDto) {
//        String password = userDto.getPassword();
//        String name = userDto.getFirstName();
//        String email = userDto.getEmail();
//
//
//    }
}
