package main.java.config.application;

import org.glassfish.jersey.server.ResourceConfig;

public class ApplicationConfig extends ResourceConfig {

    public ApplicationConfig() {
        System.out.println("Initialized App Config");
        packages("main.java.gateway"); //Only one API gateway
        //packages("main.java.resources.manager"); //Resources
    }
}