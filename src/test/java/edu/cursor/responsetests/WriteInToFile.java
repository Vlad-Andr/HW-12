package edu.cursor.responsetests;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.cursor.userData.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Map;
import java.util.Random;

@RunWith(SpringRunner.class)
public class WriteInToFile {
    private static final String TEST_PATH = "resultTest.json";
    Random random = new Random();

    ObjectMapper objectMapper;

    public WriteInToFile() {
        objectMapper = new ObjectMapper();
    }

    @Test
    public void testSerializationToFile() throws IOException {

        User user = new User();
        user.setAccessId(random.nextInt(10));
        user.setName("MyName");
        user.setSurname("MySurName");
        user.setEmail("mymail@g.com");
        user.setLastLoginDate(LocalDate.of(2010,10,10));
        user.setStatusHW("hw1","true");

        objectMapper.writeValue(new FileOutputStream(TEST_PATH),user);
    }
}