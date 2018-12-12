package com.greenfox.bankofsimba.Controller;

import com.greenfox.bankofsimba.Model.Animal;
import com.greenfox.bankofsimba.Model.Bank;
import com.greenfox.bankofsimba.Model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class AccountController {
  private Bank bank = new Bank();

  @GetMapping("/")
  public String showAllAccounts(Model model){
    model.addAttribute("accounts", bank.getBankAccounts());
    return "show";
  }

  @GetMapping("/show")
  public String showBankAccount(Model model) {
    BankAccount example = new BankAccount(new Animal("Simba", "lion", false, true), 2000);
    ArrayList<BankAccount> exampleList = new ArrayList<>();
    exampleList.add(example);
    model.addAttribute("accounts", exampleList);
    return "show";
  }

  @GetMapping("/htmlception")
  public String htmlCeption(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "htmlception";
  }
}
