package edu.cursor.service;

import edu.cursor.userData.User;

import java.time.LocalDate;
import java.util.*;

public class UsersList {
    private Random randomId = new Random();

    private final List<User> users = new ArrayList<>(Arrays.asList(
            new User("Halo", "Brandon", LocalDate.of(2019, 8, 1), "h1@gmail.com", Map.of("HW1", false,"HW2", false), 0),
            new User("Tristan", "Kreeper", LocalDate.of(2019, 8, 2), "t2@gmail.com", Map.of("HW1", false,"HW2", true), randomId.nextInt(100)),
            new User("Samuel", "Ljackson", LocalDate.of(2019, 8, 3), "s3@gmail.com", Map.of("HW1", true,"HW2", true), randomId.nextInt(100))
    ));

    public List<User> getUsers() {
        return users;
    }
}
