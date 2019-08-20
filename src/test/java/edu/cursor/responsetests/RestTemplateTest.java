package edu.cursor.responsetests;

import edu.cursor.userData.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
public class RestTemplateTest {

    @Test
    public void testToGet(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8081/users/user";
        ResponseEntity<User> getResponse = restTemplate.getForEntity(url,User.class);
        assertEquals(HttpStatus.OK,getResponse.getStatusCode());
    }
}
