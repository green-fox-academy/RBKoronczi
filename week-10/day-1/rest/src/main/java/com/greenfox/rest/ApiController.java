package com.greenfox.rest;

import com.greenfox.rest.Model.Doubling;
import com.greenfox.rest.Model.ErrorMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required=false) Integer input) {
    if(input != null) {
      return new Doubling(input);
    } else {
      return new ErrorMessage("Please provide an input!");
    }
  }
}
