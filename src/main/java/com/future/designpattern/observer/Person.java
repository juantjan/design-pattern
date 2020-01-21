package com.future.designpattern.observer;

import lombok.Data;

/**
 * @author juan.tjandra
 */
@Data
public class Person implements Observer {
  private String message;

  @Override
  public void update(String message) {
    this.message = message;
  }
}
