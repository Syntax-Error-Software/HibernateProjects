package org.jsp.jpa;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;
public class FetchingByPhone {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter phone number to fetch Merchant Details");
		long phone=s.nextLong();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		String jpql="select m from Merchant m where m.phone=?1";
		Query q=manager.createQuery(jpql);
		q.setParameter(1, phone);
		List<Merchant> merchants=q.getResultList();
		if(merchants.isEmpty())
		{
			System.err.println("No Merchant Found");
		}
		else
		{
			for (Merchant m : merchants) {
				System.out.println(m);
			}
		}
	}

}
