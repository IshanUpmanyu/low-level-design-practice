package com.ishanupamanyu.model.user;

public class User {
  private UserRole userRole = UserRole.STUDENT;

  private String firstName;
  private String lastName;
  private String email;

  public User(String firstName, String lastName, String email, UserRole role){
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.userRole = role;
  }

  public UserRole getUserRole(){
    return this.userRole;
  }
  public String getFirstName(){
    return this.firstName;
  }
  public String getLastName(){
    return this.lastName;
  }
  public String getEmail(){
    return this.email;
  }
}
