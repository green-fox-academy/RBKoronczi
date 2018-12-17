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
    repository.save(new ToDo(action, false));
  }

  public void delete(long id) {
    repository.deleteById(id);
  }

  public ToDo getToDoByID(long id) {
    return repository.findById(id).get();
  }

  public void updateToDo(long id, String text, Boolean isDone, Boolean isUrgent) {
    ToDo toDo = repository.findById(id).get();
    if(text.length() != 0) {
      toDo.setTitle(text);
    }
    if(isDone != null) {
      toDo.setDone(true);
    } else {
      toDo.setDone(false);
    }
    if(isUrgent != null) {
      toDo.setUrgent(true);
    } else {
      toDo.setUrgent(false);
    }
    repository.save(toDo);
  }
}
