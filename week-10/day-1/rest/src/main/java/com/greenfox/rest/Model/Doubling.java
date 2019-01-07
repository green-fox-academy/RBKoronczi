package com.greenfox.rest.Model;

public class Doubling {
  private int received;
  private int result;

  public Doubling(Integer received) {
    this.received = received;
    this.result = received * 2;
  }

  public Doubling() {
  }

  public int getReceived() {
    return received;
  }

  public int getResult() {
    return result;
  }

  public void setReceived(int received) {
    this.received = received;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
