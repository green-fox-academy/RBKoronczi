package com.greenfox.todoembedded;

import com.greenfox.todoembedded.Model.ToDo;
import com.greenfox.todoembedded.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoEmbeddedApplication implements CommandLineRunner {
  private ToDoRepository repository;

  @Autowired
  TodoEmbeddedApplication(ToDoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(TodoEmbeddedApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new ToDo("I have to learn Object Relational Mapping", true));
    repository.save(new ToDo("Buy Homework", false));
    repository.save(new ToDo("Walk milk", true));
    repository.save(new ToDo("Do dog", false));
  }
}

