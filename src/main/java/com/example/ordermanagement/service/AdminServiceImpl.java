package com.example.ordermanagement.service;

import com.example.ordermanagement.dto.AdminRequest;
import com.example.ordermanagement.model.MenuItem;
import com.example.ordermanagement.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Override
    public String createOrder(AdminRequest adminRequest) {
        MenuItem menuItem = maptoMenuItem(adminRequest);
        adminRepository.save(menuItem);
        return "Menu created";
    }

    @Override
    public List<MenuItem> getMenuItemsList() {
        return adminRepository.findAll();
    }

    @Override
    public String updateOrder(Long id,AdminRequest adminRequest) {
        MenuItem exitmenuItem = adminRepository.findById(id).orElse(null);
        if(exitmenuItem != null){
            exitmenuItem.setDishName(adminRequest.getDishName());
            exitmenuItem.setPrice(adminRequest.getPrice());
            exitmenuItem.setCategory(adminRequest.getCategory());
            adminRepository.save(exitmenuItem);
        }
        else {
                return "Menu item not found";
        }
        return "Menu updated";
    }

    @Override
    public String deleteOrder(long id) {
        MenuItem exitmenuItem = adminRepository.findById(id).orElse(null);
        if(exitmenuItem != null){
          adminRepository.delete(exitmenuItem);
        }
        return "Menu deleted";
    }
    MenuItem maptoMenuItem(AdminRequest adminRequest) {
       MenuItem menuItem = new MenuItem();
       menuItem.setId(adminRequest.getId());
       menuItem.setDishName(adminRequest.getDishName());
       menuItem.setPrice(adminRequest.getPrice());
       menuItem.setCategory(adminRequest.getCategory());
       menuItem.setAvailable(adminRequest.isAvailable());
       return menuItem;
    }
}
