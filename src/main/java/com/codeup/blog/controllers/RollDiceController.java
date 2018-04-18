package com.codeup.blog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
public class RollDiceController {

    @GetMapping("/roll-dice")
    public String userMessage() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public String guess(@PathVariable int n, Model model) {
        int rnd = (int) (Math.random() * 6 +1);
        boolean res = (n == rnd);
        model.addAttribute("answer", res);
        model.addAttribute("correct", rnd);
        return "roll-guess";
    }






}
