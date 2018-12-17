package com.greenfox.todoembedded.Controller;

import com.greenfox.todoembedded.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/todo")
public class ToDoController {
  private ToDoRepository repository;

  @Autowired
  public ToDoController(ToDoRepository repository) {
    this.repository = repository;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model) {
    String example = "This is my first Todo";
    ArrayList todosExample = new ArrayList();
    todosExample.add(example);
    model.addAttribute("todos", todosExample);
    return "todolist";
  }
}
