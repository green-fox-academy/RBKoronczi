package com.greenfox.mysqltodo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;
  private Assignee assignee;
  private ArrayList<ToDo> subtasks;

  public ToDo(String title, boolean isUrgent, Assignee assignee) {
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = false;
    this.assignee = assignee;
  }

  public ToDo() {
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public void setDone(boolean done) {
    isDone = done;
  }
}
