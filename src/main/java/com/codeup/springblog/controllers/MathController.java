package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{number}/and/{numberthree")
    @ResponseBody
    public int adding(@PathVariable int number, @PathVariable int numberthree) {
        return (number+numberthree);
    }

    @GetMapping("/multiply/{number}/and/{x")
    @ResponseBody
    public int multiply(@PathVariable int number, @PathVariable int x) {
        return (number*x);
    }

    @GetMapping("/add/{number}/and/{y")
    @ResponseBody
    public int divide(@PathVariable int number, @PathVariable int y) {
        return (number/y);
    }

}
