package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  private long id;
  private String content;
  private static AtomicLong counter = new AtomicLong();

  public Greeting(String content) {
    this.id = counter.getAndIncrement();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
