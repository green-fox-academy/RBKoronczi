package com.greenfox.mysqltodo.Controller;

import com.greenfox.mysqltodo.Model.ToDo;
import com.greenfox.mysqltodo.Service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/create")
  public String create() {
    return "create";
  }

  @PostMapping("/create")
  public String create(String name) {
    service.addTodo(name);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/delete")
  public String delete(@PathVariable("id") long id) {
    service.delete(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/{id}/edit")
  public String showEditPage(Model model, @PathVariable("id") long id) {
    model.addAttribute("toDo" ,service.getToDoByID(id));
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String edit(@PathVariable("id") long id, String title, Boolean isDone, Boolean isUrgent) {
    service.updateToDo(id, title, isDone, isUrgent);
    return "redirect:/todo/list";
  }
}
