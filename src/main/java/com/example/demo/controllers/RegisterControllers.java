package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RegisterControllers {
    @GetMapping("/register")
    public ModelAndView register() {
        ModelAndView mv = new ModelAndView("registration");
        return mv;
    }
}
