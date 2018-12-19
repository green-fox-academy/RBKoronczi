package com.greenfox.mysqltodo.Controller;

import com.greenfox.mysqltodo.Service.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneeController {
  private AssigneeService service;

  @Autowired AssigneeController(AssigneeService service) {
    this.service = service;
  }

  @GetMapping(value = {"/", "/list"})
  public String listAll(Model model) {
    model.addAttribute("listOfAssignees",service.listAll());
    return "assigneelist";
  }

  @PostMapping("/add")
  public String add(String name, String email) {
    service.add(name, email);
    return "redirect:/assignee/";
  }

  @GetMapping("/{id}/edit")
  public String showEditName(Model model, @PathVariable("id") long id) {
    model.addAttribute("assignee",service.getAssigneeById(id));
    return "editAssignee";
  }

  @PostMapping("/{id}/edit")
  public String editAssignee(@PathVariable("id") long id, String newName) {
    service.editName(id, newName);
    return "redirect:/assignee/";
  }

  @PostMapping("/{id}/delete")
  public String deleteAssignee(@PathVariable("id") long id) {
    service.remove(id);
    return "redirect:/assignee/";
  }
}
