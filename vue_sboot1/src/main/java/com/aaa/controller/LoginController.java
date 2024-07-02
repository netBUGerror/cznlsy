package com.aaa.controller;

import com.aaa.entity.Users;
import com.aaa.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class LoginController {
    @Autowired
    private IUsersService usersService;
    @GetMapping("/login")
    public Users login(Users users){
        return usersService.login(users);
    }
}
