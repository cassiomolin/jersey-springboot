package com.cassiomolin.example.greeting.api.resource;

import com.cassiomolin.example.AbstractApiTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;

/**
 * Tests for the greeting resource class.
 *
 * @author cassiomolin
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingResourceTest extends AbstractApiTest {

    @Test
    public void getGreeting() {
        Response response = client.target(baseUri).path("greetings").request().get();
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }
}
