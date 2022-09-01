package com.tns.association.client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tns.association.entities.Employee;
import com.tns.association.entities.Manager;

public class InheritanceTest {
	
public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		 Employee emp1=new Employee(); emp1.setNamee("Madhu"); emp1.setSalary(10000); 
		 em.persist(emp1);
	
		Manager manager1=new Manager();
		manager1.setNamee("Akshi");
		manager1.setSalary(35000);
		manager1.setDepartmentName("Tester");
		em.persist(manager1);
		 
		em.getTransaction().commit();
		System.out.println("Added one employee and manager to database.");
		
	}
}
