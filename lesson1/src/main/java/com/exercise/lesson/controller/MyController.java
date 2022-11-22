package com.exercise.lesson.controller;

import com.exercise.lesson.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MyController {

    @GetMapping("/header")
    public String getHeader(@RequestHeader("My-Header") String myHeader){
        return "Your header is : " + myHeader;
    }

    @PostMapping("users")//save işlemi için
    public User saveUser(@RequestBody User user){//kullanıcıya veri gönderme
        System.out.println("User saved!");
        user.setPassword("");
        return user;
    }

    @PostMapping("users-all")
    public List<User> saveAllUser(@RequestBody List<User> users){//kullanıcıya liste şeklinde veri gönderme
        System.out.println("All user saved!");
        users.forEach(user -> user.setPassword(""));
        return users;
    }













}








