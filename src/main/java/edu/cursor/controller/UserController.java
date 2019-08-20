package edu.cursor.controller;

import edu.cursor.service.UserService;
import edu.cursor.userData.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {
    private final UserService userService;
    Random random = new Random();
    @GetMapping("user")
    public List<User> createUser() {
        User user = new User();
        user.setAccessId(random.nextInt(10));
        user.setName("MyName");
        user.setSurname("MySurName");
        user.setEmail("mymail@g.com");
        user.setLastLoginDate(LocalDate.of(2010,10,10));
        user.setStatusHW("hw1",true);
        return (List<User>) user;
    }

    @PostMapping("user/add")
    public void addNewUser(@RequestBody User user) {
        userService.addNewUser(user);
    }

    @GetMapping("all")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("user/{email}")
    public List<User> getOneUserByEmail(@PathVariable String email) {
        return userService.getOneUserByEmail(email);
    }

}