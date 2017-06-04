package com.cassiomolin.example.api.resources;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Resource class for greeting-related operations.
 *
 * @author cassiomolin
 */
@Component
@Path("greetings")
public class GreetingResource {

    /**
     * Get a greeting.
     *
     * @return
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getPublicGreeting() {
        return Response.ok("Hello from the other side!").build();
    }
}