package com.future.designpattern.factory;

/**
 * @author juan.tjandra
 */
public class Header implements Content{
  @Override
  public void showDetail() {
    System.out.println("Watch your head");
  }
}
