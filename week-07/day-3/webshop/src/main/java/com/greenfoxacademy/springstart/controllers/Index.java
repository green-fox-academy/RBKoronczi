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
    addItemListToModel(model, shop);
    return "shop";
  }

  @RequestMapping("/onlyAvailable")
  public String onlyAvailable(Model model) {
    ListOfItemsInShop shop = new ListOfItemsInShop();
    shop.sortOnlyAvailable();
    addItemListToModel(model, shop);
    return "shop";
  }

  @RequestMapping("/cheapestFirst")
  public String cheapestFirst(Model model) {
    ListOfItemsInShop shop = new ListOfItemsInShop();
    shop.cheapestFirst();
    addItemListToModel(model, shop);
    return "shop";
  }

  @RequestMapping("/containsNike")
  public String containsNike(Model model) {
    ListOfItemsInShop shop = new ListOfItemsInShop();
    shop.contains("Nike");
    addItemListToModel(model, shop);
    return "shop";
  }

  @RequestMapping("/averageStock")
  public String averageStock(Model model) {
    ListOfItemsInShop shop = new ListOfItemsInShop();
    double stock = shop.getAvgStock();
    model.addAttribute("string", stock);
    return "shopSingle";
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
