package com.greenfox.foxclub.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxDen {
  List<Fox> den;

  FoxDen() {
    den = new ArrayList<>();
  }

  public List<Fox> getDen() {
    return den;
  }

  public void addFox(Fox fox) {
    den.add(fox);
  }

  public boolean containsName(String name) {
    return den.stream().map(fox -> fox.getName()).anyMatch(fox -> fox.equalsIgnoreCase(name));
  }

  public Fox getFoxWithName(String name) {
    return den.stream().filter(fox -> fox.getName().equalsIgnoreCase(name)).findFirst().get();
  }
}
