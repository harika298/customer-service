package com.service.customer.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "customers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Customer implements Serializable {

    @Id
    private int custId;

    private String name;
/*
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = {CascadeType.ALL},
            targetEntity = Order.class)
    @JsonManagedReference
    private List<Order> orderList;*/

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "add_id")
    @JsonManagedReference
    private Address address;

    public Customer() {
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public Customer(int custId, String name, Address address) {
        this.custId = custId;
        this.name = name;
        this.address = address;
    }
}
