package com.example.ordermanagement.dto;

import com.example.ordermanagement.model.CustomerOrder;
import com.example.ordermanagement.model.MenuItem;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
public class AdminResponse {
    private AdminResponse(MenuItem menuItem) {
        menuItem.getId();
        menuItem.getDishName();
        menuItem.getCategory();
        menuItem.getPrice();
        menuItem.isAvailable();

    }
}
