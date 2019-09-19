package edu.cursor.service;

import edu.cursor.userData.User;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public interface UserService {
        User getInfoByUser(String email);
        void saveUserToFile(User user) throws IOException;
}

