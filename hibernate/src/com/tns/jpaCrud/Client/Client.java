package com.tns.jpaCrud.Client;

import com.tns.jpaCrud.Entities.Student;
import com.tns.jpaCrud.Service.StudentService;
import com.tns.jpaCrud.Service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StudentService studentService=new StudentServiceImpl();
		
		Student student1=new Student();
		
		//Insert operation
		student1.setStudent_id(1);
        student1.setName("K L Rahul");
        studentService.addStudent(student1);
        
        //Retrieval operation
       /* Student student2=studentService.findStudentById(102);
        System.out.println(student2);
        
        //Update Operation
        student2.setName("M S Dhoni");
        studentService.updateStudent(student2);
        
        studentService.removeStudent(student2);*/
	
	}

}
