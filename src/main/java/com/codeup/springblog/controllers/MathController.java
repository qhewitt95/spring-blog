package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{number}/and/{numberTwo")
    @ResponseBody
    public int adding(@PathVariable int number, @PathVariable int numbertwo) {
        return (number+numbertwo);
    }

    @GetMapping("/multiply/{number}/and/{numberTwo")
    @ResponseBody
    public int multiply(@PathVariable int number, @PathVariable int numbertwo) {
        return (number*numbertwo);
    }

    @GetMapping("/add/{number}/and/{numberTwo")
    @ResponseBody
    public int divide(@PathVariable int number, @PathVariable int numbertwo) {
        return (number/numbertwo);
    }

}
