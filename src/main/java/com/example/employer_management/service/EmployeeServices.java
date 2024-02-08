package com.example.employer_management.service;

import com.example.employer_management.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;


public interface EmployeeServices {
    List<EmployeeEntity> findAllEmployee();
    Optional<EmployeeEntity> findById(Long id);
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    void deleteEmployee(Long id);

}
