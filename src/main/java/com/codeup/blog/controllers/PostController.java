package com.codeup.blog.controllers;


import com.codeup.blog.Services.PostService;
import com.codeup.blog.dao.PostRepository;
import com.codeup.blog.models.Post;
import com.codeup.blog.models.User;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class PostController {


    private final PostRepository postDao;


    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }


    @GetMapping("/posts")
    public String index(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "/posts/index";
    }

    @GetMapping("/posts/{id}")
    public String show(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String create(Model viewModel) {
        viewModel.addAttribute("newPost", new Post());
        return "posts/create";
    }


    @PostMapping("/posts/create")
    public String insert(@Valid Post newPost, Errors errors, Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("newPost", newPost);
            return "post/create";
        }
        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        newPost.setUser((loggedInUser));
        postDao.save(newPost);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String edit(@PathVariable long id, Model viewModel) {
        viewModel.addAttribute("post", postDao.findOne(id));
        return"posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String update(@PathVariable long id, @ModelAttribute Post post){
        Post originalPost = postDao.findOne(id);
        originalPost.setTitle(post.getTitle());
        originalPost.setBody(post.getBody());
        postDao.save(originalPost);
        return "redirect:/posts";
    }


    @PostMapping("/posts/{id}/delete")
    public String delete(@PathVariable long id){
        postDao.delete(id);
        return "redirect:/posts";
    }


}