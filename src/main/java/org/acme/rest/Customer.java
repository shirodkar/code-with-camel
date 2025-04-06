package org.acme.rest;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

public class Customer extends PanacheEntity {

    private String name;

}
