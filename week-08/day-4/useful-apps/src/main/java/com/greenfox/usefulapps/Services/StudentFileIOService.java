package com.greenfox.usefulapps.Services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentFileIOService implements StudentServiceInterface {
  Path source;

  public StudentFileIOService() {
    this.source = Paths.get("names.txt");
  }

  public List<String> findAll() {
    return getNames();
  }

  public void save(String student) {
    List<String> names = getNames();
    names.add(student);
    try {
      Files.write(source, names);
    } catch (IOException eX) {
      System.err.println(eX.getMessage());
    }
  }

  public int count() {
    return getNames().size();
  }

  public boolean checkStudent(String name) {
    return getNames().contains(name);
  }

  private List<String> getNames() {
    List<String> names;
    try {
      names = Files.readAllLines(source);
    } catch (IOException eX) {
      names = new ArrayList<>();
    }
    return names;
  }
}
