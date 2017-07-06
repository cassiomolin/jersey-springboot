package com.cassiomolin.example.greeting.service;

import org.springframework.stereotype.Service;

/**
 * Service that provides the a greeting.
 *
 * @author cassiomolin
 */
@Service
public class GreetingService {

    /**
     * Get a greeting.
     *
     * @return
     */
    public String getGreeting() {
        return "Hello from the other side!";
    }
}