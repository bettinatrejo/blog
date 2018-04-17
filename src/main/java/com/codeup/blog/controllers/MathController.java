package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MathController {

    @GetMapping(path = "/add/{number1}/and/{number2}")
    @ResponseBody
    public int add(@PathVariable int number1, @PathVariable int number2) {
        return (number1 + number2);
    }

    @GetMapping(path = "/subtract/{number1}/from/{number2}")
    @ResponseBody
    public int subtract(@PathVariable int number1, @PathVariable int number2) {
        return (number2 - number1);
    }

    @GetMapping(path = "/multiply/{number1}/and/{number2}")
    @ResponseBody
    public int multiply(@PathVariable int number1, @PathVariable int number2) {
        return (number1 * number2);
    }

    @GetMapping(path = "/divide/{number1}/by/{number2}")
    @ResponseBody
    public int divide(@PathVariable int number1, @PathVariable int number2) {
        return (number1/number2);
    }

}
