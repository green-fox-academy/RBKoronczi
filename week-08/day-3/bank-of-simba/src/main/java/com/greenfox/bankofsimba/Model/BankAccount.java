package com.greenfox.bankofsimba.Model;

public class BankAccount {
  private Animal owner;
  private int balance;

  public BankAccount(Animal owner, int balance) {
    this.owner = owner;
    this.balance = balance;
  }

  public String getName() {
    return owner.getName();
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return owner.getType();
  }

  public boolean isKing() {
    return owner.isKing();
  }

  public boolean isGoodGuy() {
    return owner.isAgoodGuy();
  }
}
