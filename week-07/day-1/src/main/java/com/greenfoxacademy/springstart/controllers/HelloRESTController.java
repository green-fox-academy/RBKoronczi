package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class HelloRESTController {

  @RequestMapping
  public Greeting greet() {
      return new Greeting(0, "Hello TipTop");
  }
}
