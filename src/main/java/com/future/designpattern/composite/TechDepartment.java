package com.future.designpattern.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author juan.tjandra
 */
@Data
@AllArgsConstructor
public class TechDepartment implements Department{
  private String id;
  private String name;

  @Override
  public void printDepartmentName() {
    System.out.println(name);
  }
}
