package com.offcn.demo.controller;

import com.offcn.demo.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThreeThymeleafController {
    @GetMapping("/third")
    public String third(Model model){
        List<User> list = new ArrayList<>();
        User user = new User(1,"1",1);
        User user1 = new User(2,"2",2);
        User user2 = new User(3,"3",3);
        list.add(user);
        list.add(user1);
        list.add(user2);
        model.addAttribute("list",list);
        return "index3";
    }
}
