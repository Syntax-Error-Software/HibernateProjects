package org.jsp.jpa;

import java.util.Scanner;

import javax.persistence.*;

public class UpdateByUsingMerge {
	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter Id To Fetch Merchant Details:");
//		int id = s.nextInt();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction t = manager.getTransaction();

		Merchant m = new Merchant();
		m.setId(4);
		m.setName("SivaBhargavi");
		m.setEmail("bagi@gmail.com");
		m.setGst_no("bagi123");
		m.setPassword("BAGI123");
		m.setPhone(9121893827L);
		m=manager.merge(m);
		t.begin();
		t.commit();
	}

}
