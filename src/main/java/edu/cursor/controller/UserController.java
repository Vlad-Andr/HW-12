package edu.cursor.controller;

import edu.cursor.service.UserServiceImpl;
import edu.cursor.userData.User;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("user")
public class UserController {

    private final UserServiceImpl userServiceImpl = new UserServiceImpl();

    @GetMapping("/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
        return userServiceImpl.getInfoByUser(email);
    }

    @PostMapping("/add")
    public void addUserToFile(@RequestBody User user) throws IOException {
        userServiceImpl.saveUserToFile(user);
    }

}



