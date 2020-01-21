package com.future.designpattern.observer;

/**
 * @author juan.tjandra
 */
public interface Broadcaster {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyMessage(String message);
}
