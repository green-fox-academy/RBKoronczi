package com.greenfox.rest.Model;

public class ArrayObject {
  public String what;
  public int[] numbers;

  public int sum() {
    int result = 0;
    for(int number : numbers) {
      result += number;
    }
    return result;
  }

  public int multiply() {
    int result = 1;
    for(int number : numbers) {
      result *= number;
    }
    return result;
  }

  public int[] doubling() {
    int[] result = numbers.clone();
    for (int i = 0; i < result.length; i++) {
      result[i] *= 2;
    }
    return result;
  }
}
