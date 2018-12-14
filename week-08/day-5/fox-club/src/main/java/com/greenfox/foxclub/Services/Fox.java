package com.greenfox.foxclub.Services;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private String food;
  private String drink;
  private List<String> tricks;

  public Fox(String name) {
    this.name = name;
    if (this.name.equalsIgnoreCase("Mr. Green")) {
      this.food = "salad";
      this.drink = "water";
    } else {
      this.food = "pizza";
      this.drink = "coffee";
    }
    tricks = new ArrayList<>();
  }

  public String getName() {
    return name;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public List<String> getTricks() {
    return tricks;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public void addTrick(String trick) {
    tricks.add(trick);
  }
}
