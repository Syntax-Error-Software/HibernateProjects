package org.jsp.jpa;
import java.util.Scanner;
import javax.persistence.*;
public class SaveMerchant 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The name,phone,email,gstno and password:");
		Merchant m=new Merchant();
		m.setName(s.next());
		m.setPhone(s.nextLong());
		m.setEmail(s.next());
		m.setGst_no(s.next());
		m.setPassword(s.next());
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		manager.persist(m);
		t.begin();
		t.commit();
		System.out.println("Generated Id Is:"+m.getId());
	}

}
