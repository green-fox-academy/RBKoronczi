package com.greenfoxacademy.springstart.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ShopItemFileHandler {
  private static String sourceName = "items.txt";

  public static List<ShopItem> readItemsFromFile() {
    List<String> content = readFile();
    List<ShopItem> shopItemList = new ArrayList<>();
    for (String row: content) {
      shopItemList.add(getItemFromRow(row));
      System.err.println(getItemFromRow(row));
    }
    return shopItemList;
  }

  private static ShopItem getItemFromRow(String row) {
    String[] itemParts = row.split(";");
    if(itemParts.length > 3) {
      String name = itemParts[0];
      String description = itemParts[1];
      double price = Double.parseDouble(itemParts[2]);
      int qty = Integer.parseInt(itemParts[3]);
      return new ShopItem(name, description, price, qty);
    }
    return null;
  }

  private static List<String> readFile() {
    Path source = Paths.get(sourceName);
    try {
      return Files.readAllLines(source);
    } catch (IOException eX) {
      System.err.println(eX.getMessage());
      return null;
    }
  }
}
