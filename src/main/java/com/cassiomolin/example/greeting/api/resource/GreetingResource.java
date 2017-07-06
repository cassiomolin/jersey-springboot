package com.cassiomolin.example.greeting.api.resource;

import com.cassiomolin.example.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Component that exposes REST endpoints for greetings.
 *
 * @author cassiomolin
 */
@Component
@Path("greetings")
public class GreetingResource {

    @Autowired
    private GreetingService greetingService;

    /**
     * Get a greeting.
     *
     * @return
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getGreeting() {
        String greeting = greetingService.getGreeting();
        return Response.ok(greeting).build();
    }
}