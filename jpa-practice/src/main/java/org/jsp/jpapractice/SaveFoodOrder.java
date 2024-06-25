package org.jsp.jpapractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveFoodOrder {
	public static void main(String[] args) {
		FoodOrder order=new FoodOrder();
		order.setFood_item("Prawns Biryani");
		order.setCost(200);
		
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("development");
		EntityManager manager=fac.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		
		t.begin();
		manager.persist(order);
		t.commit();
	}

}
