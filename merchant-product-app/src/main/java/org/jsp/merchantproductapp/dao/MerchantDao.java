

package org.jsp.merchantproductapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.merchantproductapp.dto.Merchant;

public class MerchantDao {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
	EntityManager manager=factory.createEntityManager();
	public Merchant saveMerchant(Merchant merchant)
	{
		EntityTransaction t=manager.getTransaction();
		t.begin();
		manager.persist(merchant);
		t.commit();
		return merchant;
	}
	public Merchant updateMerchant(Merchant merchant)
	{
		EntityTransaction t=manager.getTransaction();
		Merchant m=manager.find(Merchant.class, merchant.getId());
		if(m!=null)
		{
			m.setName(merchant.getName());
			m.setEmail(merchant.getEmail());
			m.setGst_no(merchant.getGst_no());
			m.setPassword(merchant.getPassword());
			m.setPhone(merchant.getPhone());
			t.begin();
			t.commit();
			System.out.println("Merchant Details are updated successfully...."+merchant.getId());
		}
		return null;
	}
	public Merchant findById(int id)
	{
		return manager.find(Merchant.class, id);
	}
	public Merchant verify(long phone, String password)
	{
		Query q=manager.createQuery("select m from Merchant m where m.phone=?1 and m.password=?2");
		q.setParameter(1, phone);
		q.setParameter(2, password);
		
		try {
			return (Merchant) q.getSingleResult();
			
		}
		catch(NoResultException e)
		{
			return null;
			
		}
	}
	public Merchant verify(String email, String password)
	{
		Query q=manager.createQuery("select m from Merchant m where m.email=?1 and m.password=?2");
		q.setParameter(1, email);
		q.setParameter(2, password);
		
		try {
			return (Merchant) q.getSingleResult();
			
		}
		catch(NoResultException e)
		{
			return null;
			
		}
	}

}
