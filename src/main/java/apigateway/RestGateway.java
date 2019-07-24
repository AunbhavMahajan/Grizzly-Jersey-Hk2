package main.java.apigateway;

import org.glassfish.jersey.server.ResourceConfig;

public class RestGateway extends ResourceConfig {

    public RestGateway() {
        System.out.println("Initialized restgateway");
        packages("main.java.spellchecker.rest"); //Resources
    }
}