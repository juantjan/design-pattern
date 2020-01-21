package com.future.designpattern.iterator;

/**
 * @author juan.tjandra
 */
public interface NewList<O> {
  NewIterator<O> iterator();
}
