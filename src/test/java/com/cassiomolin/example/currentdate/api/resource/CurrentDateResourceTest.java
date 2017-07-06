package com.cassiomolin.example.currentdate.api.resource;

import com.cassiomolin.example.AbstractApiTest;
import com.cassiomolin.example.currentdate.api.model.CurrentDateDetails;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Tests for the current date resource class.
 *
 * @author cassiomolin
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CurrentDateResourceTest extends AbstractApiTest {

    @Test
    public void getCurrentDate() {

        Response response = client.target(baseUri).path("current-date").request().get();
        assertEquals(Response.Status.OK.getStatusCode(), response.getStatus());

        CurrentDateDetails currentDateDetails = response.readEntity(CurrentDateDetails.class);
        assertNotNull(currentDateDetails);
        assertNotNull(currentDateDetails.getCurrentDate());
    }
}
