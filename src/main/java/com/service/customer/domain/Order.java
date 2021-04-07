/*
package com.service.customer.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "orders")
public class Order {

    @Id
    private int orderId;
    private Date dateOfOrder;
    private String description;

    @ManyToOne(targetEntity = Customer.class)
    @JoinColumn(name = "cust_id")
    @JsonBackReference
    private Customer customer;

    public Order() {
    }

    public Order(int orderId, Date dateOfOrder, String description, Customer customer) {
        this.orderId = orderId;
        this.dateOfOrder = dateOfOrder;
        this.description = description;
        this.customer = customer;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getDateOfOrder() {
        return dateOfOrder;
    }

    public void setDateOfOrder(Date dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", dateOfOrder=" + dateOfOrder +
                ", description='" + description + '\'' +
                '}';
    }
}

*/
