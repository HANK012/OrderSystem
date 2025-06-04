package com.example.ordermanagement.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class MenuItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String dishName;
    private int price;
    private String category;        //訂單類型
    private boolean  isAvailable;    //是否上架
    private LocalDateTime createdAt;//訂單開立時間
}
