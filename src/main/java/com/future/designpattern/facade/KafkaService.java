package com.future.designpattern.facade;

import org.springframework.stereotype.Component;

/**
 * @author juan.tjandra
 */
@Component
public class KafkaService {
  public void sendMessage (String username) {
    System.out.println(username + " has been logged in");
  }
}
