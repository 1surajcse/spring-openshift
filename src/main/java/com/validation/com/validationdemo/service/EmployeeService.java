package com.validation.com.validationdemo.service;

import com.validation.com.validationdemo.entity.Employee;
import com.validation.com.validationdemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public ResponseEntity<Employee> save(Employee employee) {

        return ResponseEntity.ok(employeeRepository.save(employee));
    }

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
