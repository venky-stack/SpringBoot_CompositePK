package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Employee;
import com.example.entity.EmployeePk;
import com.example.repo.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	public EmployeeRepository employeeRepo;
	
	@GetMapping("/")
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}
	@GetMapping("/employee/{employeeId}")
	public List<Employee> getEmployee() {
		return employeeRepo.findAll();
	}
	@PostMapping("/employee")
	public String createEmployee(@RequestBody Employee e){
		employeeRepo.save(e);
		return "One Record Saved..";
	}
	@PutMapping("/employee/{employeeId}")
	public String updateEmployee(@RequestBody Employee e){
		employeeRepo.save(e);
		return "Updated Record..";
	}
	
	@DeleteMapping("/employee/{employeeId}/{deptId}")
	public String deleteEmployee(@PathVariable Integer deptId, @PathVariable Integer employeeId){
		System.out.println("Deleting Employee with ID: " + employeeId + " and Dept ID: " + deptId);
		EmployeePk e = new EmployeePk(deptId,employeeId);
		employeeRepo.deleteById(e);
		return "One Record is deleted..";
	}
}