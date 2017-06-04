package com.cassiomolin.example.api.resources;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import java.net.URI;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class GreetingResourceTest {

    @LocalServerPort
    private int port;

    private URI uri;

    private Client client;

    @Before
    public void setUp() throws Exception {
        this.uri = new URI("http://localhost:" + port + "/api");
        this.client = ClientBuilder.newClient();
    }

    @Test
    public void getGreeting() {
        Response response = client.target(uri).path("greetings").request().get();
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());
    }
}
