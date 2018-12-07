package com.greenfoxacademy.springstart.main;

public class ShopItem {
  private String name;
  private String description;
  private double price;
  private int qty;

  public ShopItem(String name, String description, double price, int qty) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.qty = qty;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQty() {
    return qty;
  }

  public String toString() {
    return "" + this.name + " " + this.description + " " + this.price + " " + this.qty;
  }
}
