package com.cassiomolin.example.api.resources;

import com.cassiomolin.example.api.providers.ObjectMapperProvider;
import com.cassiomolin.example.api.resources.CurrentDateResource.CurrentDateDetails;
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
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CurrentDateResourceTest {

    @LocalServerPort
    private int port;

    private URI uri;

    private Client client;

    @Before
    public void setUp() throws Exception {
        this.uri = new URI("http://localhost:" + port + "/api");
        this.client = ClientBuilder.newBuilder().register(ObjectMapperProvider.class).build();
    }

    @Test
    public void getGreeting() {

        Response response = client.target(uri).path("current-date").request().get();
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());

        CurrentDateDetails currentDateDetails = response.readEntity(CurrentDateDetails.class);
        assertNotNull(currentDateDetails);
        assertNotNull(currentDateDetails.getCurrentDate());
    }
}
