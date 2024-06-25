package org.jsp.jpa;

import javax.persistence.*;

public class TestCfg {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
		System.out.println(factory);
	}

}
