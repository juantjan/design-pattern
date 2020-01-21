package com.future.designpattern.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author juan.tjandra
 */
@Component
public class LoginFacade {
  @Autowired
  KafkaService kafkaService;

  @Autowired
  SessionService sessionService;

  @Autowired
  UserService userService;

  public void makeNewLogin (String username, String password) {
    userService.login(username, password);
    kafkaService.sendMessage(username);
    sessionService.setCookie(username);

    System.out.println("SUCCESS");
  }
}
