package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("/hello")
    @ResponseBody
    public String helloFromWorld(){
        return "Hello from the world of Spring";
    }

    @GetMapping("/happy_birthday/{username}/{age}")
    @ResponseBody
    public String helloWorld(
            @PathVariable String username,
            @PathVariable int age

    ){
        return "Happy Birthday, " + username + " You are now " + age + "years old !";
    }

    @GetMapping("/weather")
    public String viewWeather(Model model){
        String[] weatherInfo = {"Hot", "Humid", "Cloudy", "Hazy", "98F"};

        model.addAttribute("temp", weatherInfo);
        return "weatherPage";
    }
}
