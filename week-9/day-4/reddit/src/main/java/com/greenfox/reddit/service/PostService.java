package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
  private PostRepository repository;

  @Autowired
  public PostService(PostRepository repository) {
    this.repository = repository;
  }

  public List<Post> listAll() {
    return repository.findAll();
  }

  public void AddPost(Post newPost) {
    repository.save(newPost);
  }

  public void upVote(long id) {
    Post post = repository.getOne(id);
    post.upVote();
    repository.save(post);
  }

  public void downVote(long id) {
    Post post = repository.getOne(id);
    post.downVote();
    repository.save(post);
  }
}
