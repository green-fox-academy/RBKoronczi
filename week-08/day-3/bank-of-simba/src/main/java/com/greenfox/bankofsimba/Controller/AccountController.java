package com.greenfox.bankofsimba.Controller;

import com.greenfox.bankofsimba.Model.Animal;
import com.greenfox.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

  @GetMapping("/show")
  public String showBankAccount(Model model) {
    BankAccount example = new BankAccount(new Animal("Simba", "lion", false, true), 2000);
    model.addAttribute("name", example.getName());
    model.addAttribute("balance", example.getBalance());
    model.addAttribute("animalType", example.getAnimalType());
    return "show";
  }

  @GetMapping("/htmlception")
  public String htmlCeption(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlception";
  }
}
