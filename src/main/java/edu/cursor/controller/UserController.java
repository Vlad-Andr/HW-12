package edu.cursor.controller;

import edu.cursor.service.UserServiceImpl;
import edu.cursor.userData.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {
    private final UserServiceImpl userServiceImpl;
 /*   @GetMapping("user")
    public void createUser() {
        User user = new User();
        user.setAccessId(random.nextInt(10));
        user.setName("MyName");
        user.setSurname("MySurName");
        user.setEmail("mymail@g.com");
        user.setLastLoginDate(LocalDate.of(2010,10,10));
        user.setStatusHW("hw1",true);
        userServiceImpl.addNewUser(user);
    }*/

    @PostMapping("user/add")
    public void addNewUser(@RequestBody User user) {
        userServiceImpl.addNewUser(user);
    }

    @GetMapping("all")
    public List<User> getAllUsers() {
        return userServiceImpl.getAllUsers();
    }

    @GetMapping("user/{email}")
    public List<User> getOneUserByEmail(@PathVariable("email") String email) {
        return userServiceImpl.getOneUserByEmail(email);
    }

}