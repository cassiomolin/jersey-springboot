package com.cassiomolin.example.currentdate.api.resource;

import com.cassiomolin.example.currentdate.api.model.CurrentDateDetails;
import com.cassiomolin.example.currentdate.service.CurrentDateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.ZonedDateTime;

/**
 * Component that exposes REST endpoints for the current date.
 *
 * @author cassiomolin
 */
@Component
@Path("current-date")
public class CurrentDateResource {

    @Autowired
    private CurrentDateService currentDateService;

    /**
     * Get the current date.
     *
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCurrentDate() {

        ZonedDateTime now = currentDateService.getCurrentDate();

        CurrentDateDetails currentDateDetails = new CurrentDateDetails();
        currentDateDetails.setCurrentDate(now);

        return Response.ok(currentDateDetails).build();
    }
}