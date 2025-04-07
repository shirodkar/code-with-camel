package org.acme.rest;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

public class Customer extends PanacheEntity {

    public String name;

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }


}
