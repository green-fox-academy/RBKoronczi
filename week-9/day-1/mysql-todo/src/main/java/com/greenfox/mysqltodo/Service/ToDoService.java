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
  private AssigneeService assigneeService;

  @Autowired
  ToDoService(ToDoRepository repository, AssigneeService assigneeService) {
    this.repository = repository;
    this.assigneeService = assigneeService;
  }

  public List<ToDo> listAll() {
    ArrayList<ToDo> result = new ArrayList<ToDo>();
    repository.findAll().forEach(toDo -> result.add(toDo));
    return result;
  }

  public List<ToDo> listActive() {
    return listAll().stream().filter(toDo -> !toDo.isDone()).collect(Collectors.toList());
  }

  public void addTodo(String title, String description, Boolean urgent, long assigneeId) {
    repository.save(new ToDo(title, description, urgent ? true : false, assigneeService.getAssigneeById(assigneeId)));
  }

  public void delete(long id) {
    repository.deleteById(id);
  }

  public ToDo getToDoByID(long id) {
    return repository.findById(id).get();
  }

  public void updateToDo(long id, String text, Boolean isDone, Boolean isUrgent) {
    ToDo toDo = repository.findById(id).get();
    if (text.length() != 0) {
      toDo.setTitle(text);
    }
    if (isDone != null) {
      toDo.setDone(true);
    } else {
      toDo.setDone(false);
    }
    if (isUrgent != null) {
      toDo.setUrgent(true);
    } else {
      toDo.setUrgent(false);
    }
    repository.save(toDo);
  }

  public List<ToDo> search(String input) {
    if (input != null || input.length() != 0) {
      String keyword = input.toLowerCase();
      return listAll()
          .stream()
          .filter(toDo ->
              toDo.getTitle().toLowerCase().contains(keyword)
                  || (toDo.getDescription() != null && toDo.getDescription().contains(keyword))
          )
          .collect(Collectors.toList());
    }
    return listAll();
  }

  public List<ToDo> searchByAssigneeId(long assigneeId) {
    return listAll()
        .stream()
        .filter(toDo -> toDo.getAssignee().equals(assigneeService.getAssigneeById(assigneeId)))
        .collect(Collectors.toList());
  }
}
