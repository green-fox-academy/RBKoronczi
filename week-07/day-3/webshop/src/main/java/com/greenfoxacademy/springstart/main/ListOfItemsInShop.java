package com.greenfoxacademy.springstart.main;

import java.util.ArrayList;
import java.util.List;

public class ListOfItemsInShop {
  private List<ShopItem> shopItemList;

  ListOfItemsInShop() {
    shopItemList = new ArrayList<>();
  }

  public List<ShopItem> getShopItemList() {
    return shopItemList;
  }

  public void getItemsFromFile() {
    shopItemList = ShopItemFileHandler.readItemsFromFile();
  }
}
