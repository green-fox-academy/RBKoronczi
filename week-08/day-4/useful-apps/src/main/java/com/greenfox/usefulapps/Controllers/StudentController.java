package com.greenfox.usefulapps.Controllers;

import com.greenfox.usefulapps.Services.StudentService;
import com.greenfox.usefulapps.Services.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
  StudentServiceInterface service;

  @Autowired
  StudentController(StudentServiceInterface service) {
    this.service = service;
  }

  @GetMapping("/gfa")
  public String main(Model model) {
    model.addAttribute("count",service.count());
    return "gfa";
  }

  @GetMapping("/gfa/list")
  public String listAll(Model model) {
    model.addAttribute("list", service.findAll());
    return "gfaList";
  }

  @GetMapping("/gfa/add")
  public String addStudent() {
    return "gfaAdd";
  }

  @GetMapping("/gfa/save")
  public String saveStudent(@RequestParam("name") String name) {
    service.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping("/gfa/check")
  public String checkStudent() {
    return "gfaCheck";
  }

  @GetMapping("gfa/checkResult")
  public String checkResult(@RequestParam("name") String name, Model model) {
    model.addAttribute("text",
        service.checkStudent(name)
            ? name + " is a student"
            : name + " is not a student"
    );
    return "gfaCheckResult";
  }
}
