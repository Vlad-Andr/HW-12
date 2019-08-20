package edu.cursor.rep;

import edu.cursor.userData.User;

import java.util.List;

public interface UserImpl {
     void addNewUser(User user);
     List<User> getAllUsers();
     List<User> getOneUserByEmail(String  email);
}
