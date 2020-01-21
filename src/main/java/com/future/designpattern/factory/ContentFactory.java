package com.future.designpattern.factory;

import org.springframework.stereotype.Component;

import static com.future.designpattern.factory.ContentType.BANNER;
import static com.future.designpattern.factory.ContentType.FOOTER;
import static com.future.designpattern.factory.ContentType.HEADER;

/**
 * @author juan.tjandra
 */
@Component
public class ContentFactory {
  public Content getContent (ContentType contentType) {
    if (HEADER.equals(contentType)) return new Header();
    else if (FOOTER.equals(contentType)) return new Footer();
    else if (BANNER.equals(contentType)) return new Banner();
    return null;
  }
}
