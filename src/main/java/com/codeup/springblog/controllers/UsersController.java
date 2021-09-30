package com.codeup.springblog.controllers;

import com.codeup.springblog.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.codeup.springblog.repos.UserRepository;

@Controller
public class UsersController {
@Autowired
private UserRepository userDao;


    private PasswordEncoder passwordEncoder;

    public UsersController(UserRepository userDao, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.passwordEncoder = passwordEncoder;
    }

    @GetMapping("/sign-up")
    public String showSignupForm(Model model){
        model.addAttribute("user", new User());
        return "users/sign-up";
    }

    @PostMapping("/sign-up")
    public String saveUser(@ModelAttribute User user){
        String hash = passwordEncoder.encode(user.getPassword());
        user.setPassword(hash);
        userDao.save(user);
        return "redirect:/login";
    }
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
