package com.greenfox.usefulapps.Controllers;

import com.greenfox.usefulapps.Services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UtilityController {
  @Autowired
  UtilityService service;

  @GetMapping("/useful")
  public String usefulUtilities() {
    return "index";
  }

  @GetMapping("/useful/colored")
  public String colored(Model model) {
    model.addAttribute("color", service.randomColor());
    return "colored";
  }
}
