package com.greenfox.controller;

import com.greenfox.error.model.User;
import com.greenfox.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by aze on 25/10/17.
 */
@Controller
@RequestMapping("/app")
public class AppController {

    @Autowired
    UserService service;

    @GetMapping("/")
    public String index(Model model, @ModelAttribute("user") User user) {
        model.addAttribute("yolo", service.getAll());
        return "main";
    }

    @PostMapping("/")
    public String create(User user) {
        service.save(user);
        return "redirect:/app/";
    }
}
