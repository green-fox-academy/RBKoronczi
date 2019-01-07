package com.greenfox.rest;

import com.greenfox.rest.Model.AppendAString;
import com.greenfox.rest.Model.Doubling;
import com.greenfox.rest.Model.ErrorMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      return new Doubling(input);
    } else {
      return new ErrorMessage("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greeter(
      @RequestParam(value = "name", required = false) String name,
      @RequestParam(value = "title", required = false) String title) {
    if (name == null && title == null) {
      return new ErrorMessage("Please provide a name and a title!");
    } else if (name == null) {
      return new ErrorMessage("Please provide a name!");
    } else if (title == null) {
      return new ErrorMessage("Please provide a title!");
    } else if (name.length() != 0 && title.length() != 0) {
      return new Greeter(name, title);
    } else if (name.length() == 0 && title.length() == 0) {
      return new ErrorMessage("Please provide a name and a title!");
    } else if (name.length() == 0) {
      return new ErrorMessage("Please provide a name!");
    } else {
      return new ErrorMessage("Please provide a title!");
    }
  }

  @GetMapping("/appenda/{appendable}")
  public Object appendA(@PathVariable("appendable") String appendable) {
    return new AppendAString(appendable);
  }
}

