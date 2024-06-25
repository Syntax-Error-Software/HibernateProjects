package org.jsp.jpa;
import javax.persistence.*;
import java.util.*;
public class FindingAllMerchants {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		EntityManager manager = factory.createEntityManager();
		Query q=manager.createNativeQuery("select * from merchant", Merchant.class);
		List<Merchant> merchants=q.getResultList();
		for (Merchant m : merchants) {
			System.out.println(m);
			
		}
	}

}
