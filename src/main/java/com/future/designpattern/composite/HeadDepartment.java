package com.future.designpattern.composite;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author juan.tjandra
 */
@Data
@AllArgsConstructor
@Builder
public class HeadDepartment implements Department {
  private String id;
  private String name;

  @Builder.Default
  private List<Department> childDepartments = new ArrayList<Department>();

  @Override
  public void printDepartmentName() {
    childDepartments.forEach(Department::printDepartmentName);
  }

  public void addDepartment (Department department) {
    childDepartments.add(department);
  }

  public void removeDepartment (Department department) {
    childDepartments.remove(department);
  }

}
