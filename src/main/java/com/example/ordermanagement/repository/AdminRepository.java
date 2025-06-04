package com.example.ordermanagement.repository;

import com.example.ordermanagement.model.MenuItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<MenuItem, Long> {


}
