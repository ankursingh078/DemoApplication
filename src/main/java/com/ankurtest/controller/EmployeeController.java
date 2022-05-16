package com.ankurtest.controller;

import com.ankurtest.exception.EmployeeException;
import com.ankurtest.model.Employee;
import com.ankurtest.model.dto.EmployeeDTO;
import com.ankurtest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long empId) throws EmployeeException {
        return employeeService.getEmployeeById(empId);
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody EmployeeDTO employee) {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable("id") Long empId) {
        return employeeService.deleteEmployee(empId);
    }
}
