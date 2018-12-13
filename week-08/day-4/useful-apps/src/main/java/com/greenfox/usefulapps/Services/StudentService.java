package com.greenfox.usefulapps.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements StudentServiceInterface{
  ArrayList<String> names;

  public StudentService() {
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }

  public List<String> findAll() {
    return names;
  }

  public void save(String student) {
    names.add(student);
  }

  public int count() {
    return names.size();
  }

  public boolean checkStudent(String name) {
    return names.contains(name);
  }
}
