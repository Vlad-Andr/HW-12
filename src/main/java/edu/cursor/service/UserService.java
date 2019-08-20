package edu.cursor.service;

import edu.cursor.rep.UserRep;
import edu.cursor.userData.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UserService {
    UserRep userRep = new UserRep();
    Random random = new Random();

    public void addNewUser(User user){
        user.setAccessId(random.nextInt(10));
        userRep.addNewUser(user);
    }
    public List<User> getAllUsers() {
        return userRep.getAllUsers();
    }
    public List<User> getOneUserByEmail(String email) {
        return userRep.getOneUserByEmail(email);
    }
}

