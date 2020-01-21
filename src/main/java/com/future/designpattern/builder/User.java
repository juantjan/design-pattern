package com.future.designpattern.builder;

/**
 * @author juan.tjandra
 */
public class User {
  private String firstName;
  private String lastName;
  private String age;
  private String gender;

  private User (UserBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.gender = builder.lastName;
    this.age = builder.age;
  }


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public static class UserBuilder {
    private String firstName;
    private String lastName;
    private String age;
    private String gender;

    public UserBuilder() {}

    public UserBuilder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public UserBuilder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public UserBuilder age(String age) {
      this.age = age;
      return this;
    }


    public UserBuilder gender(String gender) {
      this.gender = gender;
      return this;
    }

    public User build () {
      User user = new User(this);
      return user;
    }

  }
}
