package com.greenfox.bankofsimba.Model;

public class Animal {
  private String name;
  private String type;
  private boolean isKing;
  private boolean isAgoodGuy;

  public Animal(String name, String type, boolean isKing, boolean isAgoodGuy) {
    this.name = name;
    this.type = type;
    this.isKing = isKing;
    this.isAgoodGuy = isAgoodGuy;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  public boolean isKing() {
    return isKing;
  }

  public boolean isAgoodGuy() {
    return isAgoodGuy;
  }
}
