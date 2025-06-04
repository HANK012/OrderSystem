package com.example.ordermanagement.repository;

import com.example.ordermanagement.model.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerOrder, Long> {
}
