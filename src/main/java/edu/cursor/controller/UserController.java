package edu.cursor.controller;

import edu.cursor.service.UserServiceImpl;
import edu.cursor.userData.User;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("users")
public class UserController {

    private final UserServiceImpl userServiceImpl = new UserServiceImpl();

    @GetMapping("/user/{email}")
    public User getUserByEmail(@PathVariable("email") String email) {
        return userServiceImpl.getInfoByUser(email);
    }

    @PostMapping("addNewUser")
    public void addUserToFile(@RequestBody User user) throws IOException {
        userServiceImpl.saveUserToFile(user);
    }

}



