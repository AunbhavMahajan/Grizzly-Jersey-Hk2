package main.java.gateway;

import main.java.config.resources.ResourceMapper;
import main.java.resources.manager.ResourceManager;
import org.glassfish.hk2.api.ServiceLocator;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class GenericApiGateway {

    private ServiceLocator locator;
    private ResourceMapper mapper;

    @Inject
    public GenericApiGateway(ServiceLocator locator, ResourceMapper mapper) {
        System.out.println("Inside GenericApiGateway constructor");
        this.locator = locator;
        this.mapper = mapper;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response testService() {
        System.out.println("Inside test service of GenericApiGateway");
        return Response.ok("Test").build();
    }

    @GET
    @Path("/{endpoint}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getService(@PathParam("endpoint") String endpoint) {
        String resourceManager = mapper.getResourceManager(endpoint);
        try {
            Class resourceManagerClass = Class.forName(resourceManager);
            ResourceManager manager = (ResourceManager) locator.getService(resourceManagerClass);
            manager.sayHi();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(404, "Not Found").build();
        }
        return Response.ok("Ok").build();
    }

}
