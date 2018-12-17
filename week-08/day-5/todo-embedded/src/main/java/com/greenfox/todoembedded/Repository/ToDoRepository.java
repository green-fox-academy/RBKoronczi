package com.greenfox.todoembedded.Repository;

import com.greenfox.todoembedded.Model.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, Long> {
}
