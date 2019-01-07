package com.greenfox.rest.Log;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService implements LogServiceInterface{
  private LogRepository repository;

  @Autowired
  public LogService(LogRepository repository) {
    this.repository = repository;
  }

  public List<LogEntry> findAll() {
    return repository.findAll();
  }

  public void log(String endpoint, String data) {
    repository.save(new LogEntry(endpoint, data));
  }
}
