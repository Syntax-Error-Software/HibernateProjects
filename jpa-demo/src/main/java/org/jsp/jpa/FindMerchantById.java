package org.jsp.jpa;
import java.util.Scanner;
import javax.persistence.*;

public class FindMerchantById {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Id To Fetch Merchant Details:");
		int id=s.nextInt();
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		EntityManager manager=factory.createEntityManager();
		Merchant m=manager.find(Merchant.class, id);
		if(m!=null)
		{
			System.out.println("Merchant Details Are Found");
			System.out.println(m);
		}
		else
		{
			System.err.println("Invalid Id");
		}
		
		
	}

}
