package com.greenfox.rest.Log;

import java.util.List;

public interface LogServiceInterface {
  public List<LogEntry> findAll();
  public void log(String endpoint, String data);
}
