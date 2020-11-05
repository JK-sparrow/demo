package com.offcn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafController {

    @GetMapping("/first")
    public String first(Model model){
        String msg = "Hello,Thymeleaf";
        model.addAttribute("msg",msg);
        return "index";
    }
}
