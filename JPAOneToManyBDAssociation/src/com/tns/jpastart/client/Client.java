package com.tns.jpastart.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.jpastart.entities.Department;
import com.tns.jpastart.entities.Employee;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		Department department=new Department();
		department.setId(3);
		department.setName("CIVIL");
		
		Department department1=new Department();
		department1.setId(4);
		department1.setName("MECH");
		
		Employee employee1=new Employee();
		employee1.setEid(11);
		employee1.setEname("Madhu");
		employee1.setEsalary(50000);
		
		Employee employee2=new Employee();
		employee2.setEid(12);
		employee2.setEname("Akshi");
		employee2.setEsalary(40000);
		
		Employee employee3=new Employee();
		employee3.setEid(21);
		employee3.setEname("Bharath");
		employee3.setEsalary(30000);
		
		Employee employee4=new Employee();
		employee4.setEid(22);
		employee4.setEname("Nandhan");
		employee4.setEsalary(30000);
		
		department.addEmployee(employee1);
		department.addEmployee(employee2);
		department1.addEmployee(employee3);
		department1.addEmployee(employee4);
		
		em.persist(department);
		em.persist(department1);
		
		System.out.println("Added department along with two employees to database.");
		
		em.getTransaction().commit();

	}

}
