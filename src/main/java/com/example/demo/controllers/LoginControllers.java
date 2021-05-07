package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginControllers {
    @GetMapping("/")
    public ModelAndView login1() {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }

    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }


    @GetMapping("/forgot")
    public ModelAndView forgot() {
        ModelAndView mv = new ModelAndView("forgot-password");
        return mv;
    }
}
