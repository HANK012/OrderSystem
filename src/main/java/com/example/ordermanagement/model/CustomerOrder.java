package com.example.ordermanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class CustomerOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String customerName;
    private int totalPrice;         //訂單總價
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus; //訂單狀態
    private LocalDateTime createdAt; //訂單開立時間
}
