package com.greenfox.rest;

import com.greenfox.rest.Model.*;
import org.springframework.web.bind.annotation.*;

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

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable("action") String action, @RequestBody Until until) {
    if(until.until != 0) {
      if(action.equals("sum")) {
        return new Result(until.sumUntil());
      } else if (action.equals("factor")) {
        return new Result(until.factorUntil());
      } else {
        return new ErrorMessage("Unknown Action");
      }
    }
    return new ErrorMessage("Please provide a number!");
  }
}
