package com.future.designpattern.adapter;

/**
 * @author juan.tjandra
 */
public class XMLReader implements DocumentReader {
  @Override
  public String readHtml(String text) {
    return "";
  }

  @Override
  public String readXml(String text) {
    return text.replace("<xml>", "").replace("</xml>", "");
  }
}
