package com.example.ordermanagement.dto;

import com.example.ordermanagement.model.CustomerOrder;
import com.example.ordermanagement.model.MenuItem;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class AdminRequest {
    private int id;
    private String dishName;
    private int price;
    private String category;
    private boolean isAvailable;
    private LocalDateTime createdAt(){
        if (createdAt().equals(null)){
           createdAt().equals(LocalDateTime.now());
        }
        return createdAt();
    }


}
