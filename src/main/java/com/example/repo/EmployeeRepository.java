package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entity.Employee;
import com.example.entity.EmployeePk;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeePk>{

}