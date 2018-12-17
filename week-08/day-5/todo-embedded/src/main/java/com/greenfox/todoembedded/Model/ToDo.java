package com.greenfox.todoembedded.Model;

public class ToDo {
  private long id;
  private String title;
  private boolean isUrgent;
  private boolean isDone;

  public ToDo(long id, String title, boolean isUrgent, boolean isDone) {
    this.id = id;
    this.title = title;
    this.isUrgent = isUrgent;
    this.isDone = isDone;
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
}
