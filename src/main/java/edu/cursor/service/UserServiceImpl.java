package edu.cursor.service;

import edu.cursor.userData.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserServiceImpl {
    UserService userService = new UserService();
    Random random = new Random();

    public void addNewUser(User user){
        user.setAccessId(random.nextInt(100));
        userService.addNewUser(user);
    }
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    public List<User> getOneUserByEmail(String email) {
        return userService.getOneUserByEmail(email);
    }
}

