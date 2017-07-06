package com.cassiomolin.example.currentdate.api.model;

import java.time.ZonedDateTime;

/**
 * API model for returning the current date.
 *
 * @author cassiomolin
 */
public class CurrentDateDetails {

    private ZonedDateTime currentDate;

    public CurrentDateDetails() {

    }

    public ZonedDateTime getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(ZonedDateTime currentDate) {
        this.currentDate = currentDate;
    }
}