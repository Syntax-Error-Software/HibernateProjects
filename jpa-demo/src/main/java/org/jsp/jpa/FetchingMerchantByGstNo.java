package org.jsp.jpa;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;
public class FetchingMerchantByGstNo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter GSTn o to fetch Merchant Details");
		String gst=s.next();
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		String jpql="select m from Merchant m where m.gst_no=:ps";
		Query q=manager.createQuery(jpql);
		q.setParameter("ps",gst);
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
