package com.future.designpattern.factory;

/**
 * @author juan.tjandra
 */
public class Footer implements Content{
  @Override
  public void showDetail() {
    System.out.println("Footer: consists of list of footer detail");
  }
}
