package com.example.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class EmployeePk implements Serializable{

	private Integer employeeId;
	private Integer deptId;
	
	public EmployeePk() {}
	
	public EmployeePk(Integer employeeId, Integer deptId) {
		super();
		this.employeeId = employeeId;
		this.deptId = deptId;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	@Override
	public int hashCode() {
		return Objects.hash(deptId, employeeId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeePk other = (EmployeePk) obj;
		return Objects.equals(deptId, other.deptId) && Objects.equals(employeeId, other.employeeId);
	}
}