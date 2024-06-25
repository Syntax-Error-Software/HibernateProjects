package org.jsp.jpa;
import java.util.Scanner;
import javax.persistence.*;
public class DeletingAMerchant {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Id To Fetch Merchant Details:");
		int id = s.nextInt();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		
		Merchant m=manager.find(Merchant.class,id);
		if(m!=null)
		{
			manager.remove(m);
			t.begin();
			t.commit();
		}
		else
		{
			System.err.println("Merchant Can Not Be Deleted......");
		}
	}

}
