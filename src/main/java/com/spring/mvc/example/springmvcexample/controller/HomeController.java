package com.spring.mvc.example.springmvcexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    
    @GetMapping({"/"})
    public ModelAndView showForm() {
        return new ModelAndView("index");
    }

    @GetMapping({"/about"})
    public ModelAndView about() {
        return new ModelAndView("index");
    }
  
}
