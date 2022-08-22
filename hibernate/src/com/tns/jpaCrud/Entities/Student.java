package com.tns.jpaCrud.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")

public class Student {
	@Id
	private int studentid;
	
	private String name;

	public int getStudent_id() {
		return studentid;
	}

	public void setStudent_id(int student_id) {
		this.studentid = student_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {
	
	}

	public Student(int student_id, String name) {
		this.studentid = student_id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + "]";
	}

}
