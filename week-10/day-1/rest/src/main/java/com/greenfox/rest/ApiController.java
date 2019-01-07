package com.greenfox.rest;

import com.greenfox.rest.Log.LogEntry;
import com.greenfox.rest.Log.LogReport;
import com.greenfox.rest.Log.LogServiceInterface;
import com.greenfox.rest.Model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ApiController {
  LogServiceInterface logService;

  @Autowired
  public ApiController(LogServiceInterface logService) {
    this.logService = logService;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if (input != null) {
      logService.log("/doubling", "input=" + input.toString());
      return new Doubling(input);
    } else {
      logService.log("/doubling", "input=");
      return new ErrorMessage("Please provide an input!");
    }
  }

  @GetMapping("/greeter")
  public Object greeter(
      @RequestParam(value = "name", required = false) String name,
      @RequestParam(value = "title", required = false) String title) {
    logService.log("/greeter", "name=" + name + " title=" + title);
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
    logService.log("/appenda/" + appendable, "");
    return new AppendAString(appendable);
  }

  @PostMapping("/dountil/{action}")
  public Object doUntil(@PathVariable("action") String action, @RequestBody(required = false) Until until) {
    if(until == null) {
      logService.log("/dountil/" + action, "until=null");
      return new ErrorMessage("Please provide a number!");
    }
    logService.log("/dountil/" + action, "until=" + until.until);
    if (action.equals("sum")) {
      return new Result(until.sumUntil());
    } else if (action.equals("factor")) {
      return new Result(until.factorUntil());
    } else {
      return new ErrorMessage("Unknown Action");
    }
  }

  @PostMapping("/arrays")
  public Object arrays(@RequestBody ArrayObject array) {
    logService.log("/arrays", "numbers=" + Arrays.toString(array.numbers));
    if (array.numbers != null && array.what != null) {
      if (array.what.equals("sum")) {
        return new Result(array.sum());
      } else if (array.what.equals("multiply")) {
        return new Result(array.multiply());
      } else if (array.what.equals("double")) {
        return new Result(array.doubling());
      }
    }
    return new ErrorMessage("Please provide what to do with the numbers!");
  }

  @GetMapping("/log")
  public Object getLog() {
    logService.log("/log", "");
    return new LogReport(logService);
  }
}
