package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam("name") String name) {
    Greeting greeting = new Greeting(name);
    model.addAttribute("hello", greeting.getHello());
    model.addAttribute("name", greeting.getContent());
    model.addAttribute("counter", greeting.getId());
    model.addAttribute("fontSize", greeting.getFontSize());
    model.addAttribute("fontColor", greeting.getColor());
    return "greeting";
  }
}
