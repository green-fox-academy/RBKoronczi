package com.greenfoxacademy.springstart.main;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.List;

public class ListOfItemsInShop {
  private List<ShopItem> shopItemList;

  public ListOfItemsInShop() {
    shopItemList = new ArrayList<>();
  }

  public List<ShopItem> getShopItemList() {
    return shopItemList;
  }

  public ShopItem getNthShopItem(int index) {
    return shopItemList.get(index);
  }

  public int getShopItemListSize() {
    return shopItemList.size();
  }

  public void getItemsFromFile() {
    shopItemList = ShopItemFileHandler.readItemsFromFile();
  }

  public String toString() {
    String result = "";
    for (ShopItem item : shopItemList) {
      result +="ITEM: ";
      result += item;
      result += System.lineSeparator();
    }
    return result;
  }
}
