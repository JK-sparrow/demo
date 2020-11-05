package com.offcn.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FourThymeleafController {
    @GetMapping("/four")
    public String four(Model model){
        model.addAttribute("name","优就业");
        model.addAttribute("href","http://www.ujiuye.com");
        return "index4";
    }
}
