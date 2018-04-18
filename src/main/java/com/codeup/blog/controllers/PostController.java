package com.codeup.blog.controllers;


import com.codeup.blog.Services.PostService;
import com.codeup.blog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    PostService pSvc;

    public PostController(PostService pSvc) {
        this.pSvc = pSvc;
    }




    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", pSvc.findAll());
        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model model) {
        Post post = new Post("Test Post", "This is a test description.");
        model.addAttribute("post", pSvc.findPost(id));
        return "/posts/show";
    }

    @GetMapping("/posts/create")
    public String create(Model viewModel) {
        viewModel.addAttribute("newPost", new Post());
        return "/posts/create";
    }


    @PostMapping("/posts/create")
    public String insert(@ModelAttribute Post newPost) {
        pSvc.save(newPost);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String edit(@PathVariable long id, Model viewModel) {
        viewModel.addAttribute("post", pSvc.findPost(id));
        return"/posts/{id}/edit";
    }

    @PostMapping("/ads/edit")
    public String handleEdit(@ModelAttribute Post post){
        System.out.println("post = " + post.getId());
        return"redirect:/posts";
    }





}