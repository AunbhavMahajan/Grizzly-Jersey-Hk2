package main.java.server;

import main.java.config.application.ApplicationConfig;
import org.glassfish.hk2.api.ServiceLocator;
import org.glassfish.hk2.utilities.ServiceLocatorUtilities;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;

public class GrizzlyServer {

    public static void main(String[] args) throws IOException {
        ServiceLocator locator = ServiceLocatorUtilities.createAndPopulateServiceLocator();
        URI baseUri = UriBuilder.fromUri("http://localhost/").port(9998).build();
        GrizzlyHttpServerFactory.createHttpServer(baseUri, new ApplicationConfig(), locator);
        System.out.println("Press enter to stop the server...");
        System.in.read();
    }
}