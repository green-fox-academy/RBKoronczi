package com.greenfox.mysqltodo.Controller;

import com.greenfox.mysqltodo.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class ToDoController {
  private ToDoService service;

  @Autowired
  public ToDoController(ToDoService service) {
    this.service = service;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
    model.addAttribute("todos", isActive
        ? service.listActive()
        : service.listAll()
    );
    return "todolist";
  }
}
