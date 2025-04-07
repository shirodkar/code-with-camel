package org.acme.rest;

import org.acme.entity.Customer;

import java.util.ArrayList;
import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/customers")
public class CustomerResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Customer> customers() {
        List<Customer> customers = new ArrayList<>();
        Customer customer1 = new Customer();
        customer1.name = "Customer 1";
        customers.add(customer1);
        // Customer customer2 = new Customer(2L, "Customer 2");
        // customers.add(customer2);
        return customers;
    }
}
