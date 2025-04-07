package org.acme.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class Customer extends PanacheEntity {

    public String name;

    public Customer() {}

    public Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }


}
