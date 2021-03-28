package com.ufo.easyad.web;

import com.ufo.easyad.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/users/login")
    public User login(@RequestParam("username")String username, @RequestParam("password") String password) {
        return new User(1, username, password);
    }
}
