
package org.jsp.merchantproductapp.dao;
import java.util.List;

import javax.persistence.*;

import org.jsp.merchantproductapp.dto.Merchant;
import org.jsp.merchantproductapp.dto.Product;

public class ProductDao {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("development");
	EntityManager manager=factory.createEntityManager();
	
	public Product saveProduct(Product product,int merchant_id)
	{
		Merchant merchant=manager.find(Merchant.class, merchant_id);
		if(merchant!=null)
		{
			merchant.getProducts().add(product);
			product.setMerchants(merchant);
			EntityTransaction t=manager.getTransaction();
			manager.persist(product);
			t.begin();
			t.commit();
			return product;
		}
		return null;
		
		
	}
	public Product updateProduct(Product product)
	{
		EntityTransaction t=manager.getTransaction();
		Product p=manager.find(Product.class, product.getId());
		if(p!=null)
		{
			p.setName(product.getName());
			p.setBrand(product.getBrand());
			p.setCategory(product.getCategory());
			p.setImage_url(product.getImage_url());
			p.setCost(product.getCost());
			t.begin();
			t.commit();
			return p;
		
		}
		return null;
	}
	public Product findById(int id)
	{
		return manager.find(Product.class,id);
	}
	
	public List<Product> findByBrand(String brand)
	{
		Query q=manager.createQuery("select p from Product p where p.brand=?1");
		q.setParameter(1, brand);
		return q.getResultList();
	}
	public List<Product> findBCategory(String category)
	{
		Query q=manager.createQuery("select p from Product p where p.category=?1");
		q.setParameter(1, category);
		return q.getResultList();
	}
	
	public List<Product> findByName(String name)
	{
		Query q=manager.createQuery("select p from Product p where p.name=?1");
		q.setParameter(1, name);
		return q.getResultList();
	}
	public List<Product> findByMerchantId(int id)
	{
		Query q=manager.createQuery("select m.products from Merchant m where m.id=?1");
		q.setParameter(1, id);
		return q.getResultList();
		
	}
	
	public List<Product> findAll()
	
	{
		return manager.createQuery("select p from Product p").getResultList();
	}
	
	

	

}
