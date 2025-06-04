package com.example.ordermanagement.service;

import com.example.ordermanagement.dto.AdminRequest;
import com.example.ordermanagement.model.CustomerOrder;
import com.example.ordermanagement.model.MenuItem;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AdminService {
    String createOrder(AdminRequest adminRequest);
    List<MenuItem> getMenuItemsList();
    String updateOrder(Long id,AdminRequest adminRequest);
    String deleteOrder(long id);

}
