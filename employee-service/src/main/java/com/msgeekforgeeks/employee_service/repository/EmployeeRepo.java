package com.msgeekforgeeks.employee_service.repository;


import com.msgeekforgeeks.employee_service.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

}