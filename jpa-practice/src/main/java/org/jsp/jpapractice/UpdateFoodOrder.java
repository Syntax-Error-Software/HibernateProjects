package org.jsp.jpapractice;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateFoodOrder {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("development");
		EntityManager manager=fac.createEntityManager();
		EntityTransaction t=manager.getTransaction();
		
		FoodOrder order=manager.find(FoodOrder.class,1);
		t.begin();
		order.setCost(250);
		t.commit();
	}

}
