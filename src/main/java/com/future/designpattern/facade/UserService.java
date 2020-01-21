package com.future.designpattern.facade;

import org.springframework.stereotype.Component;

/**
 * @author juan.tjandra
 */
@Component
public class UserService {
  public void login (String username, String password) {
    System.out.println(username + ", password: " + password + " is exist");
  }
}
