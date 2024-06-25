package org.jsp.manytomanyuni;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.*;
public class SaveBatchAndStudent {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("development");
		EntityManager manager=fac.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		
		Batch b1=new Batch();
		b1.setSubject("Hibernate");
		b1.setBatch_code("E3");
		b1.setTrainer("Sathish");
		
		Batch b2=new Batch();
		b2.setSubject("Advanced java");
		b2.setBatch_code("A6");
		b2.setTrainer("GuruRaja");
		
	    Student s1=new Student();
	    s1.setName("Nandieswar");
	    s1.setYop(2023);
	    s1.setPerc(8.49);
	    
	    Student s2=new Student();
	    s2.setName("Praveen");
	    s2.setYop(2023);
	    s2.setPerc(7.49);
	    
	    Student s3=new Student();
	    s3.setName("Chari");
	    s3.setYop(2023);
	    s3.setPerc(9.49);
	    
	    List<Student> forb1=new ArrayList<Student>(Arrays.asList(s1,s3));
	    List<Student> forb2=new ArrayList<Student>(Arrays.asList(s1,s2,s3));
	    
	    b1.setStudents(forb1);
	    b2
	    .setStudents(forb2);
	    
	    manager.persist(b1);
	    manager.persist(b2);
	    t.begin();
	    t.commit();
	}

}
