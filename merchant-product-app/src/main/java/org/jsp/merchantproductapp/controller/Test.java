package org.jsp.merchantproductapp.controller;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory fac=Persistence.createEntityManagerFactory("development");
	}

}
