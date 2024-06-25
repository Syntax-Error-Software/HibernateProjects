package org.jsp.jpa;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;
public class FetchingMerchantByName {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter name to fetch Merchant Details");
		String name=s.next();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
	    Query q=manager.createNamedQuery("findByName");
	    q.setParameter(1, name);
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
