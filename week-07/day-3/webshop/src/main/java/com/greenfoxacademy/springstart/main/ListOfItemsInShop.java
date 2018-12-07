package com.greenfoxacademy.springstart.main;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

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
    return shopItemList.stream()
        .filter(shopItem -> shopItem.getQty() > 0)
        .collect(Collectors.toList());
  }

  public List<ShopItem> cheapestFirst() {
    return shopItemList.stream()
        .sorted(ShopItem::compareTo)
        .collect(Collectors.toList());
  }

  public List<ShopItem> contains(String string) {
    return shopItemList.stream()
        .filter(ShopItem -> ShopItem.getName().toLowerCase().contains(string.toLowerCase())
            || ShopItem.getDescription().toLowerCase().contains(string.toLowerCase()))
        .collect(Collectors.toList());
  }

  public double getAvgStock() {
    DoubleSummaryStatistics stats = shopItemList.stream()
        .mapToDouble(ShopItem::getQty)
        .summaryStatistics();
    return stats.getAverage();
  }

  public String getMostExpensive() {
    return shopItemList.stream()
        .max(ShopItem::compareTo)
        .get().getName();
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
