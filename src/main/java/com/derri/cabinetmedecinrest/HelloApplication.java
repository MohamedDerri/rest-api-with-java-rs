package com.derri.cabinetmedecinrest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;

@ApplicationPath("/api")
public class HelloApplication extends Application {

    @Path("/helloWorld")
    public static class HelloResource {
        @GET
        @Produces("text/plain")
        public String hello() {
            return "Hello, World!";
        }
    }
}