package com.cassiomolin.example.api;


import com.cassiomolin.example.api.providers.ObjectMapperProvider;
import com.cassiomolin.example.api.resources.CurrentDateResource;
import com.cassiomolin.example.api.resources.GreetingResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * Jersey configuration class.
 *
 * @author cassiomolin
 */
@Component
@ApplicationPath("api")
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {

        register(GreetingResource.class);
        register(CurrentDateResource.class);

        register(ObjectMapperProvider.class);
    }
}