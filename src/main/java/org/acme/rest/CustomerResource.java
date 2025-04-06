package org.acme.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/customers")
public class CustomerResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String customers() {
        return "[Customer1, Customer2, Customer3, Customer4]";
    }
}
