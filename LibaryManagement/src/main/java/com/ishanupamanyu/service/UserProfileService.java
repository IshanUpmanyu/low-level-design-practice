package com.ishanupamanyu.service;

import com.ishanupamanyu.model.user.User;
import com.ishanupamanyu.model.user.UserRole;

public class UserProfileService {

  public User createNewUser(String firstName, String lastName, String email, UserRole role){
    User user = new User(firstName, lastName, email, role);
    //DO processing with user like saving to database

    return user;
  }

  public User updateUser(User user){
    //Update user details

    return user;
  }

  public User getUserByEmail(){

    User user = null;

    //Do processing do get user from database

    return user;
  }

}
