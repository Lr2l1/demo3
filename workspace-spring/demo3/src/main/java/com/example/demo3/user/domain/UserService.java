package com.example.demo3.user.domain;

import com.example.demo3.user.dto.UserRequestDto;
import com.example.demo3.user.dto.UserResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findUserByIdAndPassword(String id, String password) {
        return userRepository.findUserByUserNameAndPassword(id, password);
//        return userRepository.test(id,password);
    }

    public User findUserByCode(int code) {
        User user = userRepository.findById(code).orElseThrow(
                () -> new IllegalArgumentException("존재하지 않는 사용자입니다.")
        );
        return user;
    }

    public UserResponseDto createUser (UserRequestDto userDto) {
        User user = new User(userDto);
        userRepository.save(user);
        UserResponseDto res = new UserResponseDto(user);
        return res;
    }

//    public User updateUser(UserRequestDto userDto) {
//        User user = userRepository.findById(code).orElseThrow(
//                () -> new IllegalArgumentException("존재하지 않는 사용자입니다.")
//        );
//
//        user.update(userDto);
//        return user;
//    }



    // 업데이트 작성



//    public boolean existsCodeLessThan (int code) {
//        return userRepository.existsCodeLessThan(1020);
//    }

}