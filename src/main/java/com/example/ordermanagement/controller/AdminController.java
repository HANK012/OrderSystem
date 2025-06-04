package com.example.ordermanagement.controller;

import com.example.ordermanagement.dto.AdminRequest;
import com.example.ordermanagement.model.MenuItem;
import com.example.ordermanagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @PostMapping
    public String createAdmin(@RequestBody AdminRequest adminRequest) {
        return adminService.createOrder(adminRequest);
    }
    @GetMapping
    public List<MenuItem> getAdminRequestsList() {
        return adminService.getMenuItemsList();
    }
    @PutMapping("/{id}")
    public String updateAdmin(@PathVariable long id, @RequestBody AdminRequest adminRequest) {
        return adminService.updateOrder(id, adminRequest);
    }
    @DeleteMapping("/{id}")
    public String deleteAdmin(@PathVariable long id) {
        return adminService.deleteOrder(id);
    }

}
