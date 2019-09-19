package edu.cursor.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.cursor.userData.User;
import org.springframework.stereotype.Service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Random;

@Service
public class UserServiceImpl implements UserService {

    private final String FILE_PATH = "infoUser.json";

    @Override
    public User getInfoByUser(String email)  {
        UsersList usersList = new UsersList();
        return usersList.getUsers().stream()
                .filter(user -> user.getEmail().equalsIgnoreCase(email))
                .findAny()
                .orElseThrow(NoSuchElementException::new);
    }

    @Override
    public void saveUserToFile(User user) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        Random random = new Random();
        user.setAccessId(random.nextInt(100));
        objectMapper.writeValue(new FileOutputStream(FILE_PATH), user);
    }
}