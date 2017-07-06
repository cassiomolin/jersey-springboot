package com.cassiomolin.example.common.api.config;


import com.cassiomolin.example.common.api.provider.ObjectMapperProvider;
import com.cassiomolin.example.currentdate.api.resource.CurrentDateResource;
import com.cassiomolin.example.greeting.api.resource.GreetingResource;
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