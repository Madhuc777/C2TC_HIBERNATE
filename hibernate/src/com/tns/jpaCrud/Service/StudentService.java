package com.tns.jpaCrud.Service;

import com.tns.jpaCrud.Entities.Student;

public interface StudentService {
	public abstract Student findStudentById(int id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
}
