package com.cassiomolin.example.api.resources;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.ZonedDateTime;

/**
 * Resource class for current date-related operations.
 *
 * @author cassiomolin
 */
@Component
@Path("current-date")
public class CurrentDateResource {

    /**
     * Get the current date.
     *
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCurrentDate() {

        ZonedDateTime now = ZonedDateTime.now().withNano(0);

        CurrentDateDetails currentDateDetails = new CurrentDateDetails();
        currentDateDetails.setCurrentDate(now);

        return Response.ok(currentDateDetails).build();
    }

    /**
     * API model for returning the current date.
     */
    public static class CurrentDateDetails {

        private ZonedDateTime currentDate;

        public ZonedDateTime getCurrentDate() {
            return currentDate;
        }

        public void setCurrentDate(ZonedDateTime currentDate) {
            this.currentDate = currentDate;
        }
    }
}