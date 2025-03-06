package com.Aditya.employeeManagementSystem_backend.service;

import com.Aditya.employeeManagementSystem_backend.dto.EmployeeDto;
import com.Aditya.employeeManagementSystem_backend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);

    EmployeeDto getEmployeeById(Long employeeId);

     List<EmployeeDto> getAllEmployees() ;

     EmployeeDto updateEmployee(Long employeeId , EmployeeDto updatedEmployee);

     void deleteEmployee(Long employeeId);
}
