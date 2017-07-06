package com.cassiomolin.example.currentdate.service;

import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

/**
 * Service that provides the current date.
 *
 * @author cassiomolin
 */
@Service
public class CurrentDateService {

    /**
     * Get the current date.
     *
     * @return
     */
    public ZonedDateTime getCurrentDate() {
        return ZonedDateTime.now().withNano(0);
    }
}