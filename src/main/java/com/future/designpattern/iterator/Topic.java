package com.future.designpattern.iterator;

/**
 * @author juan.tjandra
 */
public class Topic {
  private String id;
  public Topic (String id) {
    this.id = id;
  }

  public String getId () {
    return this.id;
  }

  public void setId (String id) {
    this.id = id;
  }
}
