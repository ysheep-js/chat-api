package com.y.chat.controller;

import com.y.chat.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description:
 * @Author: dh
 * @Date: 2021/4/18 18:09
 */
@RestController
@RequestMapping("/user")
@SpringBootTest
class UserControllerTest {

    @Test
    @GetMapping("/test")
    User test1() {
        System.out.println("123");
        User u = new User();
        u.setUsername("132");
        return u;
    }
}