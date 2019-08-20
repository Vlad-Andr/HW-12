package edu.cursor.rep;

import edu.cursor.userData.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Repository
public class UserRep implements UserImpl {
    List<User> users = new ArrayList<>();

    @Override
    public void addNewUser(User user) {
        users.add(user);
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public List<User> getOneUserByEmail(String email) {
        return users.stream().filter(t->t.getEmail().equals(email)).collect(Collectors.toList());
    }
}
