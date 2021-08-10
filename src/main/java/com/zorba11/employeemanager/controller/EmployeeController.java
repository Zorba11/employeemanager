package com.zorba11.employeemanager.controller;

import com.zorba11.employeemanager.entity.Employee;
import com.zorba11.employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    public EmployeeService employeeService;

    @GetMapping("api/employees")
    public  List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("api/employees/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("api/employees")
    public String addEmployee(@RequestBody Employee employee) {
        return "Employee Added: " + employee;
    }

    @PutMapping("api/employees/{id}")
    public String updateEmployee(@PathVariable String id) {
        return "Employee updated: " + id;
    }
}
