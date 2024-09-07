package com.msgeekforgeeks.employee_service.service;

import com.msgeekforgeeks.employee_service.entity.EmployeeEntity;
import com.msgeekforgeeks.employee_service.model.Employee;
import com.msgeekforgeeks.employee_service.repository.EmployeeRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private ModelMapper mapper;

    public Employee getEmployeeById(int id) {
        Optional<EmployeeEntity> employeeEntity = employeeRepo.findById(id);
        return mapper.map(employeeEntity, Employee.class);
    }
}
