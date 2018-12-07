package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.main.ListOfItemsInShop;
import com.greenfoxacademy.springstart.main.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Index {
  private static ListOfItemsInShop shop = new ListOfItemsInShop();

  @RequestMapping("/")
  public String allItems(Model model) {
    addItemListToModel(model, shop.getShopItemList());
    return "shop";
  }

  @RequestMapping("/onlyAvailable")
  public String onlyAvailable(Model model) {
    addItemListToModel(model, shop.sortOnlyAvailable());
    return "shop";
  }

  @RequestMapping("/cheapestFirst")
  public String cheapestFirst(Model model) {
    addItemListToModel(model, shop.cheapestFirst());
    return "shop";
  }

  @RequestMapping("/containsNike")
  public String containsNike(Model model) {
    addItemListToModel(model, shop.contains("Nike"));
    return "shop";
  }

  @RequestMapping("/averageStock")
  public String averageStock(Model model) {
    double stock = shop.getAvgStock();
    String result = "Average Stock: " + stock;
    model.addAttribute("text", result);
    return "shopSingle";
  }

  @RequestMapping("/mostExpensive")
  public String mostExpensive(Model model) {
    String name = shop.getMostExpensive();
    String result = "The most expensive item is: " + name;
    model.addAttribute("text", result);
    return "shopSingle";
  }

  @PostMapping(value="/search")
  public String Search(Model model, String input) {
    addItemListToModel(model, shop.contains(input));
    return "shop";
  }

  private void addItemListToModel(Model model, List<ShopItem> list) {
    try {
      model.addAttribute("items", list);
    } catch (NullPointerException eX) {
      System.err.println(eX.getMessage());
      System.err.println(list);
    }
  }
}
