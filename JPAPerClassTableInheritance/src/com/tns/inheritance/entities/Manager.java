package com.tns.inheritance.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager extends Employee{
	
	private String departmentName;

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
}
