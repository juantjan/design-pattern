package com.future.designpattern.adapter;

import static com.future.designpattern.adapter.DocType.HTML;
import static com.future.designpattern.adapter.DocType.XML;

/**
 * @author juan.tjandra
 */
public class DocumentAdapter implements Reader {
  DocumentReader documentReader;
  public DocumentAdapter (DocType docType) {
    if (XML.equals(docType)) {
      documentReader = new XMLReader();
    } else if (HTML.equals(docType)) {
      documentReader = new HTMLReader();
    }
  }

  @Override
  public String read(DocType docType, String text) {
    if (HTML.equals(docType)) {
      return documentReader.readHtml(text);
    } else if (XML.equals(docType)) {
      return documentReader.readXml(text);
    }
    return "";
  }
}
