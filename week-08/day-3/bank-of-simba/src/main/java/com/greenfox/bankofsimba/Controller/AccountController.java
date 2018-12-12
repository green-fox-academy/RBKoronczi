package com.greenfox.bankofsimba.Controller;

import com.greenfox.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

  @GetMapping("/show")
  public String showBankAccount(Model model) {
    BankAccount example = new BankAccount("Simba", 2000.00, "lion");
    model.addAttribute("name", example.getName());
    model.addAttribute("balance", example.getBalance());
    model.addAttribute("animalType", example.getAnimalType());
    return "whatever";
  }
}
