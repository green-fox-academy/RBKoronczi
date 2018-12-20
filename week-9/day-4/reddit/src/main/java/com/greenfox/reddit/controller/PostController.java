package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostController {
  private PostService service;

  @Autowired
  public PostController(PostService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String listAll(Model model, @RequestParam(value="page", required = false) Integer page) {
    if(page == null || page < 1) {
      page = 1;
    }
    model.addAttribute("posts", service.getDefaultFrontpage(page - 1));
    model.addAttribute("pageCount", service.getPageCount());
    return "index";
  }

  @GetMapping("/create")
  public String createForm(@ModelAttribute("post") Post post) {
    return "createPost";
  }

  @PostMapping("/create")
  public String create(Post post) {
    service.AddPost(post);
    return "redirect:/";
  }

  @PostMapping("/{id}/upVote")
  public String upVote(@PathVariable("id") long id) {
    service.upVote(id);
    return "redirect:/";
  }

  @PostMapping("/{id}/downVote")
  public String downVote(@PathVariable("id") long id) {
    service.downVote(id);
    return "redirect:/";
  }
}
