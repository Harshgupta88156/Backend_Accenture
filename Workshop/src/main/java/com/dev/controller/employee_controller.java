package com.dev.controller;


import com.dev.model.employee;
import com.dev.service.employee_service;
import com.dev.service.employee_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/employees")
public class employee_controller {

    private final employee_service employee_service;

    @Autowired
    public employee_controller(employee_service employee_service) {
        this.employee_service = employee_service;
    }

    // Get all employees
    @GetMapping
    public List<employee> getallemployee() {
        List<employee> employees = employee_service.getallemployee();
        return employees;
    }

    // Get employee by ID
    @GetMapping("/{id}")
    public employee getemployeebyID(@PathVariable int id) {
        employee employeee = employee_service.getemployeebyID(id);
        return employeee;
    }

    // Get employees by worked hours (example placeholder)
    @GetMapping("/worked-hours")
    public List<employee> getallemployeebyworkedhour(@RequestBody employee emp) {
        List<employee> employees = employee_service.getallemployeebyworkedhour(emp.getRole());
        return employees;
    }

    }
