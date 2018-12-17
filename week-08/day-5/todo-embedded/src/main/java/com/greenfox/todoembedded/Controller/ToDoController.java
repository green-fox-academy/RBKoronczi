package com.greenfox.todoembedded.Controller;

import com.greenfox.todoembedded.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class ToDoController {
  private ToDoRepository repository;

  @Autowired
  public ToDoController(ToDoRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/")
  @ResponseBody
  public String list() {
    return "This is my first Todo";
  }
}
