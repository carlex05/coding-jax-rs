package io.carlex.samples.code.with.se;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Carlex
 */
@Path("/greetings")
public class GreetingResource {
    
    @GET
    @Path("/hello")
    @Produces(MediaType.APPLICATION_JSON)
    public Greeting sayHello(){
        return new Greeting("Hello world!");
    }
    
}
