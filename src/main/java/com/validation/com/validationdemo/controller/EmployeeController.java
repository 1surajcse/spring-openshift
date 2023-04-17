package com.validation.com.validationdemo.controller;

import com.validation.com.validationdemo.entity.Employee;
import com.validation.com.validationdemo.exception.IncorrectDataFoundException;
import com.validation.com.validationdemo.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import javax.sound.midi.Soundbank;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
private  EmployeeService employeeService;
    @Value("${welcome}")
    public String message;
    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody @Valid Employee employee)  {
        System.out.println(message);
         return  employeeService.save(employee);

    }
@GetMapping
    public List<Employee> findEmployees(){

        return employeeService.findAll();

    }

    @GetMapping("/welcome")
    public String welcome(){

        return message;

    }

}
