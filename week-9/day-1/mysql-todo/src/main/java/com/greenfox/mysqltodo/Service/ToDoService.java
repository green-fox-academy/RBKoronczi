package com.greenfox.mysqltodo.Service;

import com.greenfox.mysqltodo.Model.ToDo;
import com.greenfox.mysqltodo.Repository.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ToDoService {
  private ToDoRepository repository;

  @Autowired
  ToDoService(ToDoRepository repository) {
    this.repository = repository;
  }

  public List<ToDo> listAll() {
    ArrayList<ToDo> listOfTodos = new ArrayList<ToDo>();
    repository.findAll().forEach(toDo -> listOfTodos.add(toDo));
    return listOfTodos;
  }

  public List<ToDo> listActive() {
    return listAll().stream().filter(toDo -> !toDo.isDone()).collect(Collectors.toList());
  }

  public void addTodo(String action) {
    ToDo toDo = new ToDo(action, false);
    repository.save(toDo);
  }
}
