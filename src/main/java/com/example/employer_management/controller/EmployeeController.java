package com.example.employer_management.controller;

import com.example.employer_management.entity.EmployeeEntity;
import com.example.employer_management.service.EmployeeServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")

public class EmployeeController {
    private final EmployeeServices employeeServices;

    public EmployeeController(EmployeeServices employeeServices) {
        this.employeeServices = employeeServices;
    }
    @GetMapping
    public List<EmployeeEntity> findAllEmployee() {
        return employeeServices.findAllEmployee();
    }
    @GetMapping("/(id)")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id){
        return employeeServices.findById(id);
    }
    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
        return employeeServices.saveEmployee(employeeEntity);
    }
    @PutMapping
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeServices.updateEmployee(employeeEntity);
    }
    @DeleteMapping("/(id)")
    public void deleteEmployee(@PathVariable("id") Long id){
        employeeServices.deleteEmployee(id);
    }
}
