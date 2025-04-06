package org.acme.rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/customers")
public class CustomerResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> customers() {
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer1 = new Customer();
        customer1.setName("Customer 1");
        customers.add(customer);
        return customers;
    }
}
