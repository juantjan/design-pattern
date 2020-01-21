package com.future.designpattern.adapter;

/**
 * @author juan.tjandra
 */
public class HTMLReader implements DocumentReader {

  @Override
  public String readHtml(String text) {
    return text.replace("<html>", "").replace("</html>", "");
  }

  @Override
  public String readXml(String text) {
    return "";
  }
}
