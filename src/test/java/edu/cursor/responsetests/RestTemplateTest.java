package edu.cursor.responsetests;

import edu.cursor.userData.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.time.LocalDate;
import java.util.Map;
import java.util.Objects;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class RestTemplateTest {

    private RestTemplate restTemplate = new RestTemplate();
    private final String URL = "http://localhost:8081";

    @Test
    public void getRequestTest() {
        User user = new User();
        String url = URL;
        ResponseEntity<User> responseEntity = restTemplate.getForEntity(url, User.class);
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}
