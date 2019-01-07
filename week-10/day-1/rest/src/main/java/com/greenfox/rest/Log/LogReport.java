package com.greenfox.rest.Log;

import java.util.List;

public class LogReport {
  private LogServiceInterface service;
  public List<LogEntry> entries;
  public long entry_count;

  public LogReport(LogServiceInterface service) {
    this.service = service;
    entries = service.findAll();
    entry_count = service.countEntries();
  }
}
