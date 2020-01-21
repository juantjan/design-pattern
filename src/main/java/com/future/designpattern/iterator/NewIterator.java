package com.future.designpattern.iterator;

/**
 * @author juan.tjandra
 */
public interface NewIterator <O> {
  void reset();

  O next();

  O currentItem();

  boolean hasNext();

}
