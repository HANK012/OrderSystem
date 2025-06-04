package com.example.ordermanagement.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerOrder customerOrder;
    @ManyToOne
    @JoinColumn(name = "menuItem_id")
    private MenuItem menuItem;
}
