package com.greenfox.foxclub.Controller;


import com.greenfox.foxclub.Services.Fox;
import com.greenfox.foxclub.Services.FoxDen;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
   private FoxDen den;

   @Autowired
   MainController(FoxDen den) {
     this.den = den;
   }

  @GetMapping("/")
  public String main(@RequestParam ("name") String name, Model model) {
    if(name != null && den.containsName(name)) {
      Fox fox = den.getFoxWithName(name);
      model.addAttribute("name", fox.getName());
      model.addAttribute("food", fox.getFood());
      model.addAttribute("drink", fox.getDrink());
      model.addAttribute("tricks", fox.getTricks());
      return "index";
    } else {
      return "redirect:/login";
    }
  }

  @GetMapping("/login")
  public String login() {
    return "login";
  }

  @PostMapping("/login")
  public String validateFox(String name) {
    if (!den.containsName(name)) {
      Fox fox = new Fox(name);
      den.addFox(fox);
    }
    return "redirect:/?name=" + name;
  }
}
