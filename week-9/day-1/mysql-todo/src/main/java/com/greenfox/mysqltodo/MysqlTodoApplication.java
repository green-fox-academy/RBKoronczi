package com.greenfox.mysqltodo;

import com.greenfox.mysqltodo.Model.ToDo;
import com.greenfox.mysqltodo.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlTodoApplication implements CommandLineRunner {
  private ToDoRepository repository;

  @Autowired
  MysqlTodoApplication(ToDoRepository repository) {
    this.repository = repository;
  }

  public static void main(String[] args) {
    SpringApplication.run(MysqlTodoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  }
}

