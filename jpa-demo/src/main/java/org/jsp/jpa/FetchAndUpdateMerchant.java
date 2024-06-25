package org.jsp.jpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class FetchAndUpdateMerchant {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Id To Fetch Merchant Details:");
		int id=s.nextInt();
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		
		Merchant m=manager.find(Merchant.class,id);
		m.setName("Nandieswar");
		m.setEmail("nandu@gmail.com");
		m.setGst_no("abc123");
		m.setPassword("nandu123");
		m.setPhone(9515225514L);
		t.begin();
		t.commit();
		
		
	}

}
