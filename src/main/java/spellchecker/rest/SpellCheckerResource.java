package main.java.spellchecker.rest;

import main.java.spellchecker.pojo.SpellChecker;
import main.java.spellchecker.service.Dictionary;
import org.glassfish.hk2.api.ServiceLocator;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/spellchecker")
public class SpellCheckerResource  {

    private SpellChecker spl;

    @Inject
    public SpellCheckerResource(SpellChecker spl) {
        System.out.println("Inside spell checker resource const");
        this.spl = spl;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response testService() {
        System.out.println("Inside test service of spell check");
        return Response.ok("Test").build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{word}")
    public Response getSpellRecommendations(@PathParam("word") String word) {
        System.out.println("Inside getSpellRecommendations of spell check");
        spl.sayHi();
        return Response.ok("Test").build();
    }

}
