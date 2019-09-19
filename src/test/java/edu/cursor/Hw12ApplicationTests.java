package edu.cursor;

import edu.cursor.userData.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Map;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class Hw12ApplicationTests {

    private final RestTemplate restTemplate = new RestTemplate();

    private String URL = "http://localhost:8095";

    User user = new User("Halo", "Brandon", LocalDate.of(2019, 8, 1), "h1@gmail.com", Map.of("HW1", false,"HW2", false), 0);

    @Test
    public void getUserByRestTemplateTest() {
        String url = URL + "/users/user/h1@gmail.com";
        ResponseEntity<User> responseEntity = restTemplate.getForEntity(url, User.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(user, responseEntity.getBody());
    }

    @Test
    public void serializationToJsonByRestTemplateTest() {
        String url = URL + "/users/addNewUser";
        HttpEntity<User> userRequest = new HttpEntity<>(user);
        ResponseEntity<User> responseEntity = restTemplate.postForEntity(url, userRequest, User.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}
/*@RunWith(SpringRunner.class)
@SpringBootTest
public class Hw12ApplicationTests {
    private final RestTemplate restTemplate = new RestTemplate();

    @Test
    public void getUserInfoTest() {
        User testUser = new User("Alex", "First", LocalDate.parse("2019-07-30"), 1, "alexfirst@domain.com", Map.of("Arrays", true, "Collections", false, "Exceptions", true));
        String url = "http://localhost:8081/user/?email=alexfirst@domain.com";
        ResponseEntity<User> responseEntity = restTemplate.getForEntity(url, User.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(testUser, responseEntity.getBody());
    }

    @Test
    public void writeUserToJsonTest() {
        User userToJson = new User("Alex", "First", LocalDate.parse("2019-07-30"), 1, "alexfirst@domain.com",
                Map.of("Arrays", true, "Collections", false, "Exceptions", true));
        String url = "http://localhost:8081/user";
        HttpEntity<User> httpEntity = new HttpEntity<>(userToJson);
        ResponseEntity<HttpStatus> responseEntity = restTemplate.postForEntity(url, httpEntity, HttpStatus.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(HttpStatus.OK, responseEntity.getBody());
    }
}*/
