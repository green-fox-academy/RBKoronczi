package com.greenfox.mysqltodo.Repository;

import com.greenfox.mysqltodo.Model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssigneeRepository extends CrudRepository<Assignee, Long> {
}
