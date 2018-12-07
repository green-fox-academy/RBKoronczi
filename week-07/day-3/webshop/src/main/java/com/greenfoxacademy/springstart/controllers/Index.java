package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.main.ListOfItemsInShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Index {

  @RequestMapping("/")
  public String allItems(Model model) {
    ListOfItemsInShop shop = new ListOfItemsInShop();
    shop.getItemsFromFile();
    addItemListToModel(model, shop);
    return "shop";
  }

  private void addItemListToModel(Model model, ListOfItemsInShop shop) {
    try {
      model.addAttribute("items", shop.getShopItemList());
    } catch (NullPointerException eX) {
      System.err.println(eX.getMessage());
      System.err.println(shop);
    }
  }
}
