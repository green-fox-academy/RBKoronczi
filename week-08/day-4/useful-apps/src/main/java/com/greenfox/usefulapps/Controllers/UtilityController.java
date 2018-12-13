package com.greenfox.usefulapps.Controllers;

import com.greenfox.usefulapps.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {
  UtilityService service;

  @Autowired
  UtilityController(UtilityService service) {
        this.service = service;
  }

  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/useful")
  public String usefulUtilities() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String colored(Model model) {
    model.addAttribute("color", service.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String validateEmail(@RequestParam("email") String address, Model model) {
    model.addAttribute("text",
        service.emailValidator(address)
            ? address + " is a valid email address"
            : address + " is not a valid email address"
    );
    model.addAttribute("textColor", service.emailValidator(address) ? "green" : "red");
    return "validator";
  }

  @GetMapping("useful/caesar")
  public String caesarEncode(
      @RequestParam("text") String text,
      @RequestParam("number") int number,
      @RequestParam("var") String var,
      Model model) {
    if(var.equals("encode")) {
      model.addAttribute("text",
          service.caesar(text, number));
    } else {
      model.addAttribute("text",
          service.caesar(text, -number));
    }
    return "caesar";
  }
}
