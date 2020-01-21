package com.future.designpattern.observer;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author juan.tjandra
 */
@Component
public class FutureBroadcaster implements Broadcaster{
  List<Observer> observerList = new ArrayList<Observer>();

  @Override
  public void addObserver(Observer observer) {
    observerList.add(observer);
  }

  @Override
  public void removeObserver(Observer observer) {
    observerList.remove(observer);
  }

  @Override
  public void notifyMessage(String message) {
    observerList.forEach(observer -> observer.update(message));
  }
}
