package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @GetMapping("/posts")
    @ResponseBody
    public String showPost(){
        return "posts index page";
    }

    @GetMapping("/posts{id}")
    @ResponseBody
    public String showOnePost(@PathVariable int id){
        return "view an individual post";
    }


    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "view form for creating post";
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String newPost(){
        return "posts index page";
    }
}
