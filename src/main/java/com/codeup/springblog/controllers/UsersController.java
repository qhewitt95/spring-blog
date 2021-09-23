package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsersController {

    @GetMapping("/user/create")
    @ResponseBody
    public String createUser(
            @RequestParam(name = "uname" )String username,
            @RequestParam(name = "psw") String password
    ){
        System.out.println("Username " + username);
        System.out.println("Password " + password);
        return "User Created";
    }
}
