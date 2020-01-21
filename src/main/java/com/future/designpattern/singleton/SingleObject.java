package com.future.designpattern.singleton;

/**
 * @author juan.tjandra
 */
public class SingleObject {
  private String statusName = "this is status name";
  private static SingleObject instance = new SingleObject();

  private SingleObject() {}

  public static SingleObject getSIntance () {
    return instance;
  }

  public void sayHi () {
    System.out.println("hi");
  }

  public String getStatusName() {
    return statusName;
  }

  public void setStatusName(String statusName) {
    this.statusName = statusName;
  }
}
