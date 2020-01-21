package com.future.designpattern.factory;

/**
 * @author juan.tjandra
 */
public class Banner implements Content {
  private String title = "this is banner title";
  @Override
  public void showDetail() {
    System.out.println("Disini ada image carouselnya");
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }
}
