package com.greenfox.usefulapps.Services;

import java.util.List;

public interface StudentServiceInterface {
  public List<String> findAll();
  public void save(String student);
  public int count();
  public boolean checkStudent(String name);
}
