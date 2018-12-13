package com.greenfox.usefulapps.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Random;

@Service
public class UtilityService {
  ArrayList<String> colors;
  Random random;

  public UtilityService() {
    colors = new ArrayList<>();
    colors.add("red");
    colors.add("blue");
    colors.add("lime");
    colors.add("orange");
    colors.add("magenta");
    random = new Random();
  }

  public String randomColor() {
    return colors.get(random.nextInt(colors.size()));
  }

  public boolean emailValidator(String address) {
    if(address.contains("@") && address.indexOf("@") == address.lastIndexOf("@")) {
      int index = address.indexOf("@");
      return address.substring(index).contains(".");
    }
    return false;
  }
}