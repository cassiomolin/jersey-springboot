package com.cassiomolin.example;

import com.cassiomolin.example.common.api.provider.ObjectMapperProvider;
import org.junit.Before;
import org.springframework.boot.context.embedded.LocalServerPort;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import java.net.URI;

/**
 * Base class for REST API testing.
 *
 * @author cassiomolin
 */
public abstract class AbstractApiTest {

    @LocalServerPort
    protected int port;

    protected URI baseUri;

    protected Client client;

    @Before
    public void setUp() throws Exception {
        this.baseUri = new URI("http://localhost:" + port + "/api");
        this.client = ClientBuilder.newClient().register(ObjectMapperProvider.class);
    }
}
