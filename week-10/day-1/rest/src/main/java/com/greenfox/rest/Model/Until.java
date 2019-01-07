package com.greenfox.rest.Model;

public class Until {
  public int until;

  public int sumUntil() {
    int result = 0;
    for (int i = 1; i <= until; i++) {
      result += i;
    }
    return result;
  }

  public int factorUntil() {
    int result = 1;
    for (int i = 1; i <= until; i++) {
      result *= i;
    }
    return result;
  }
}
