package com.future.designpattern.adapter;

import org.springframework.stereotype.Component;

import static com.future.designpattern.adapter.DocType.HTML;
import static com.future.designpattern.adapter.DocType.XML;

/**
 * @author juan.tjandra
 */
@Component
public class FutureDocumentReader implements Reader {
  DocumentAdapter documentAdapter;
  @Override
  public String read(DocType docType, String text) {
    if (XML.equals(docType) || HTML.equals(docType)) {
      documentAdapter = new DocumentAdapter(docType);
      return documentAdapter.read(docType, text);
    }
    return "Error: Cannot parse this kind of docType";
  }
}
