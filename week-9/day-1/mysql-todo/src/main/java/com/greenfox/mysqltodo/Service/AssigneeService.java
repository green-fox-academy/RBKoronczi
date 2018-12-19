package com.greenfox.mysqltodo.Service;

import com.greenfox.mysqltodo.Model.Assignee;
import com.greenfox.mysqltodo.Repository.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
