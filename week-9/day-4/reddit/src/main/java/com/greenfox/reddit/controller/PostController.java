package com.greenfox.reddit.controller;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PostController {
  private PostService service;

  @Autowired
  public PostController(PostService service) {
    this.service = service;
  }

  @GetMapping("/")
  public String listAll(Model model) {
    model.addAttribute("posts", service.listAll());
    return "index";
  }

  @GetMapping("/create")
  public String createForm(@ModelAttribute("post") Post post) {
    return "createPost";
  }

  @PostMapping("/create")
  public String create(Post post) {
    System.err.println(post.getTitle() + " created");
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
