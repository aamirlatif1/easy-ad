package com.ufo.easyad.web;

import com.ufo.easyad.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/login")
    public User login(){
        return new User(1, "test", "test");
    }
}
