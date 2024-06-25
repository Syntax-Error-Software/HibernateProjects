package org.jsp.jpa;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;
public class FetchingMerchantByEmail {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Email to fetch Merchant Details");
		String email=s.next();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		String jpql="select m from Merchant m where m.email=:ps";
		Query q=manager.createQuery(jpql);
		q.setParameter("ps",email);
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
