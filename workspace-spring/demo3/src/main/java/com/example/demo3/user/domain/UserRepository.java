package com.example.demo3.user.domain;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;

import javax.persistence.Entity;
import java.sql.Timestamp;

public interface UserRepository extends JpaRepositoryImplementation<User, Integer> {

    // 1. Query Creation Method

    public User findUserByUserNameAndPassword(String userName, String password);



    // 업데이트문을


//    public boolean existsCodeLessThan(int code);


    // 2. Native Query -> 쿼리의 난이도 가 높을때만 사용! (권장x)
//    @Query(nativeQuery = true, value = "SELECT * FROM user WHERE user_name=?1 AND password=?2")
//    public User test(@Param("userName") String userName,@Param("password") String password);
}
