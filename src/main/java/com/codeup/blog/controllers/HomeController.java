package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
//    @GetMapping("/")
//    @ResponseBody
//    public String hello() {
//        return "This is the landing page!";
//    }



    @GetMapping("/")
    public String welcome()
    {
        return "index";
    }

//    @GetMapping("/home/{name}")
//    public String welcomeUser(@PathVariable String name, Model model) {
//        model.addAttribute("name", name);
//        return "home";
//    }
//
//    @GetMapping("/home/users")
//    public String welcomeUsers(@PathVariable String name, Model model) {
//
//        List<String> users = new ArrayList<>();
//        users.add("John");
//        users.add("Jack");
//
//        model.addAttribute("users", name);
//        return "home";
//    }





}
