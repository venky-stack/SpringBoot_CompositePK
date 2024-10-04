package com.example.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee_table")
public class Employee {
	
	private String name;
	private String email;
	private Long phNo;
	
	@EmbeddedId
	private EmployeePk employeePk;

	public Employee() {} 
	
	public Employee(String name, String email, Long phNo, EmployeePk employeePk) {
		super();
		this.name = name;
		this.email = email;
		this.phNo = phNo;
		this.employeePk = employeePk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhNo() {
		return phNo;
	}

	public void setPhNo(Long phNo) {
		this.phNo = phNo;
	}

	public EmployeePk getEmployeePk() {
		return employeePk;
	}

	public void setEmployeePk(EmployeePk employeePk) {
		this.employeePk = employeePk;
	}
}