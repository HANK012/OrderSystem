package com.example.ordermanagement.model;

import org.springframework.web.bind.annotation.ResponseStatus;

public enum OrderStatus {
    RECEIVED,
    PREPARING,
    DONE
}
