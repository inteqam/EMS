package com.Aditya.employeeManagementSystem_backend.repository;

import com.Aditya.employeeManagementSystem_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeRepository extends JpaRepository<Employee , Long> {
}
