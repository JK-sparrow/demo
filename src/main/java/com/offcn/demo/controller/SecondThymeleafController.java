package com.offcn.demo.controller;

import com.offcn.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SecondThymeleafController {

    @GetMapping("/second")
    public String second(Model model){
        String msg = "Hello,Thymeleaf";
        User user = new User();
        user.setAge(11);
        user.setId(1);
        user.setName("阿大");
        Map map = new HashMap();
        map.put("p1","p1.jpg");
        map.put("p2","p2.jpg");
        model.addAttribute("msg",msg);
        model.addAttribute("user",user);
        model.addAttribute("map",map);
        return "index2";
    }
}
