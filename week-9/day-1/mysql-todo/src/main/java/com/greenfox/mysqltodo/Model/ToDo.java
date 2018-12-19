package com.greenfox.mysqltodo.Model;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
public class ToDo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String description;
  private boolean isUrgent;
  private boolean isDone;
  private ArrayList<ToDo> subtasks;

  @ManyToOne
  @JoinColumn(name = "assignee_id")
  private Assignee assignee;

  public ToDo(String title, String description, boolean isUrgent, Assignee assignee) {
    this();
    this.title = title;
    this.description = description;
    this.isUrgent = isUrgent;
    this.isDone = false;
    this.assignee = assignee;
  }

  public ToDo() {
    subtasks = new ArrayList<>();
  }

  public long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getDescription() {
    return description;
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

  public void setDescription(String description) {
    this.description = description;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  public void addSubtask(ToDo toDo) {
    this.subtasks.add(toDo);
  }

  public Assignee getAssignee() {
    return assignee;
  }

  public ArrayList<ToDo> getSubtasks() {
    return subtasks;
  }

  public void setAssignee(Assignee assignee) {
    this.assignee = assignee;
  }

  public void setSubtasks(ArrayList<ToDo> subtasks) {
    this.subtasks = subtasks;
  }
}
