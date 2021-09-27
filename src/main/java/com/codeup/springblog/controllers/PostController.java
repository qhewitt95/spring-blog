package com.codeup.springblog.controllers;

import models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import repos.PostRepository;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {


        private final PostRepository postDao;

        public PostController(PostController postDao) {
            this.postDao = (PostRepository) postDao;
        }
    @GetMapping("/posts")
    public String showPost(){

        List <Post> allPosts = new ArrayList<>();

        allPosts.add(new Post( "post1", "post1 body"));
        allPosts.add(new Post( "post@", "post2 body"));

        /*model.addAttribute("posts", allPosts);*/


        return "post/index";
    }

    @GetMapping("/posts{id}")
    public String showOnePost(@PathVariable int id, Model model){
        Post post = new Post("Title", "Fun body");
        model.addAttribute("post", post);
        model.addAttribute("postId", id);


        return "post/show";
    }


    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "view form for creating post";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String newPost(){
        return "create new post";
    }

}
