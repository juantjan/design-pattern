package com.future.designpattern.facade;

import org.springframework.stereotype.Component;

/**
 * @author juan.tjandra
 */
@Component
public class SessionService {
  public void setCookie (String username) {
    System.out.println("Set cookie with value " + username);
  }
}
