package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {

    @GetMapping(path = "/posts")
    @ResponseBody
    public String indexPost() {
        return "posts index page";
    }

    @GetMapping(path = "/posts/{id}")
    @ResponseBody
    public String individualPost(@PathVariable long id) {
        return "view an individual post" + id;
    }

    @GetMapping(path = "/posts/create")
    @ResponseBody
    public String createPost() {
        return "view the form for creating a post";
    }

    @PostMapping(path = "/posts/create")
    @ResponseBody
    public String newPost() {
        return "create a new post";
    }

}
