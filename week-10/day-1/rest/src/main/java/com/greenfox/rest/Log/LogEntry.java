package com.greenfox.rest.Log;

import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class LogEntry {
  @Id
  @GeneratedValue
  long id;

  @CreationTimestamp
  @Column(name = "create_date")
  private Date createdAt;

  private String endpoint;
  private String data;

  public LogEntry(String endpoint, String data) {
    this.endpoint = endpoint;
    this.data = data;
  }

  public LogEntry() {
  }

  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public long getId() {
    return id;
  }

  public Date getCreatedAt() {
    return createdAt;
  }
}
