package com.ankurtest.service;

import com.ankurtest.exception.EmployeeException;
import com.ankurtest.model.Employee;
import com.ankurtest.model.dto.EmployeeDTO;
import com.ankurtest.repository.EmployeeRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee saveEmployee(EmployeeDTO employeeDTO) {
        ObjectMapper objectMapper = new ObjectMapper();
        Employee employee = objectMapper.convertValue(employeeDTO, Employee.class);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        return employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long empId) throws EmployeeException {
        return employeeRepository.findById(empId)
                .orElseThrow(() -> new EmployeeException("Employee Not Found..."));
    }

    public String deleteEmployee(Long empId) {
        Employee employee = employeeRepository.findById(empId).get();
        employeeRepository.delete(employee);
        return "Employee Deleted...";
    }
}
