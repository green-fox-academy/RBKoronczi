package com.greenfox.reddit.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Getter
@Setter
public class Post {
  @Id
  @GeneratedValue
  long id;
  String title;
  int votes;

  @Column(columnDefinition = "TEXT")
  String content;

  @CreationTimestamp
  @Column(name = "create_date")
  private Date created;

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
