package com.future.designpattern.adapter;

/**
 * @author juan.tjandra
 */
public interface DocumentReader {
  public String readHtml(String text);
  public String readXml(String text);
}
