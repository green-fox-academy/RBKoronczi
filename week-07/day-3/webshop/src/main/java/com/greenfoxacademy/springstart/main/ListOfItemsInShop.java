package com.greenfoxacademy.springstart.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOfItemsInShop {
  private List<ShopItem> shopItemList;

  public ListOfItemsInShop() {
    shopItemList = new ArrayList<>();
    this.getItemsFromFile();
  }

  public List<ShopItem> getShopItemList() {
    return shopItemList;
  }

  private void getItemsFromFile() {
    shopItemList = ShopItemFileHandler.readItemsFromFile();
  }

  public List<ShopItem> sortOnlyAvailable() {
    List<ShopItem> result = new ArrayList<>();
    for (ShopItem item : shopItemList) {
      if (item.getQty() > 0) {
        result.add(item);
      }
    }
    return result;
  }

  public List<ShopItem> cheapestFirst() {
    List<ShopItem> result = shopItemList;
    Collections.sort(result);
    return result;
  }

  public List<ShopItem> contains(String string) {
    List<ShopItem> result = new ArrayList<>();
    for (ShopItem item : shopItemList) {
      if (item.getDescription().contains(string) || item.getName().contains(string)) {
        result.add(item);
      }
    }
     return result;
  }

  public double getAvgStock() {
    double avg = 0;
    for (ShopItem item : shopItemList) {
      avg += item.getQty();
    }
    avg /= shopItemList.size();
    return avg;
  }

  public String getMostExpensive() {
    double maxPrice = 0;
    String result = "";
    for (ShopItem item : shopItemList) {
      if (item.getPrice() > maxPrice) {
        maxPrice = item.getPrice();
        result = item.getName();
      }
    }
    return result;
  }

  public String toString() {
    String result = "";
    for (ShopItem item : shopItemList) {
      result += "ITEM: ";
      result += item;
      result += System.lineSeparator();
    }
    return result;
  }
}
