package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.main.ListOfItemsInShop;
import com.greenfoxacademy.springstart.main.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Index {
  ListOfItemsInShop shop;

  Index() {
    ListOfItemsInShop shop = new ListOfItemsInShop();
    shop.getItemsFromFile();
  }

  @RequestMapping("")
  public String allItems(Model model) {
    List<ShopItem> shopItemsList = shop.getShopItemList();
    model.addAttribute("items", shopItemsList);
    return "shop";
  }
}
