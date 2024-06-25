package org.jsp.manytooneuni;

import javax.persistence.*;

public class SaveDetails {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("development");
		EntityManager manager=fac.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		
		Department d=new Department();
		d.setName("Development");
		d.setLoc("BTM Layout");
		
		Employee e1=new Employee();
		e1.setDesig(" ASE");
		e1.setName("Nandieswar");
		e1.setSalary(40000);
		e1.setDepartment(d);
		
		Employee e2=new Employee();
		e2.setDesig(" Senior ASE");
		e2.setName("Praveen");
		e2.setSalary(70000);
		e2.setDepartment(d);
		
		Employee e3=new Employee();
		e3.setDesig("SE");
		e3.setName("RamPrasad");
		e3.setSalary(50000);
		e3.setDepartment(d);
		 manager.persist(e1);
		 manager.persist(e2);
		 manager.persist(e3);
		 
		 t.begin();
		 t.commit();
		
	
		
		
		
	}

}
