package com.greenfox.mysqltodo.Model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Assignee {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String email;

  @OneToMany(mappedBy = "assignee")
  private List<ToDo> toDos;

  public Assignee(String name, String email) {
    this();
    this.name = name;
    this.email = email;
  }

  public Assignee() {
  toDos = new ArrayList<>();
  }

  public long getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
