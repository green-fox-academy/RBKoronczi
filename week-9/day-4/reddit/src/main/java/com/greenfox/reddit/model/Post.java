package com.greenfox.reddit.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Post {
  @Id
  @GeneratedValue
  long id;
  String title;
  String content;
  int votes;

  public Post() {
    this.votes=1;
  }

  public Post(String title, String content) {
    this();
    this.title = title;
    this.content = content;
  }

  public void upVote() {
    this.votes++;
  }

  public void downVote() {
    this.votes--;
  }
}
