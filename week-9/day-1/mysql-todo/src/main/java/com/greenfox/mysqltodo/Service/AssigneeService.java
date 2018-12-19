package com.greenfox.mysqltodo.Service;

import com.greenfox.mysqltodo.Model.Assignee;
import com.greenfox.mysqltodo.Repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AssigneeService {
  private AssigneeRepository repository;

  @Autowired
  AssigneeService(AssigneeRepository repository) {
    this.repository = repository;
  }

  public Assignee getAssigneeById(long id) {
    return repository.findById(id).get();
  }

  public List<Assignee> listAll() {
    List<Assignee> result = new ArrayList<>();
    repository.findAll().forEach(assignee -> result.add(assignee));
    return result;
  }

  public void add(String name, String email) {
    repository.save(new Assignee(name, email));
  }

  public void remove(long id) {
    repository.deleteById(id);
  }

  public void editName(long id, String newName) {
    if(newName != null) {
      Assignee assignee = getAssigneeById(id);
      assignee.setName(newName);
      repository.save(assignee);
    }
  }
}
