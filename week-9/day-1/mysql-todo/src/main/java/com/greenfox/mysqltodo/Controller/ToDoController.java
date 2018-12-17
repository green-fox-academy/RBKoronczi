package com.greenfox.mysqltodo.Controller;

import com.greenfox.mysqltodo.Model.ToDo;
import com.greenfox.mysqltodo.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")
public class ToDoController {
  private ToDoRepository repository;

  @Autowired
  public ToDoController(ToDoRepository repository) {
    this.repository = repository;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
    ArrayList<ToDo> listOfTodos = new ArrayList<ToDo>();
    repository.findAll().forEach(toDo -> listOfTodos.add(toDo));
    model.addAttribute("todos", isActive
        ? listOfTodos.stream().filter(toDo -> !toDo.isDone()).collect(Collectors.toList())
        : listOfTodos
    );
    return "todolist";
  }
}
