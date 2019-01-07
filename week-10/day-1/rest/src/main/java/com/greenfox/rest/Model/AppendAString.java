package com.greenfox.rest.Model;

public class AppendAString {
  private String appended;

  public AppendAString(String appended) {
    this.appended = appended + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
