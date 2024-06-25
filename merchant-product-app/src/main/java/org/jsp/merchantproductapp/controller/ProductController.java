

package org.jsp.merchantproductapp.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.merchantproductapp.dao.ProductDao;
import org.jsp.merchantproductapp.dto.Product;

public class ProductController 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		ProductDao dao = new ProductDao();
		System.out.println("1.Save Product\n2.Update Product\n3.FindById\n4.FindByBrand\n5.FindByCategory\n6.FindByName\n"
				+ "7.FindByMerchantId\n8.FindAll\n9.exit");
		switch (s.nextInt()) 
		{
		case 1:
		{
			System.out.println("Enter the merchant id");
			int id=s.nextInt();
			System.out.println("enter name,brand,category,image_url and cost");
			Product p = new Product();
			p.setName(s.next());
			p.setBrand(s.next());
			p.setCategory(s.next());
			p.setImage_url(s.next());
			p.setCost(s.nextDouble());
			p = dao.saveProduct(p,id);
			System.out.println("Product details are saved with id:" + p.getId());
			if(p!=null)
			{
				System.out.println("product added with id:"+p.getId());
			}
			else
			{
				System.out.println("invalid merchant is");
			}
			break;
		}
		case 2:
		{
			System.out.println("Enter id,name,brand,category,image_urland and cost");
			Product p = new Product();
			p.setId(s.nextInt());
			p.setName(s.next());
			p.setBrand(s.next());
			p.setCategory(s.next());
			p.setImage_url(s.next());
			p.setCost(s.nextDouble());
			p = dao.updateProduct(p);
			if (p != null)
			{
				System.out.println("Product details are updated successfully.....");
			}
			break;

		}
		case 3: 
		{
			System.out.println("Enter id to fetch data");
			Product p = dao.findById(s.nextInt());
			if (p != null) {
				System.out.println(p);
			} else {
				System.err.println("Invalid id");
			}
			break;
		}
		case 4:
		{
			System.out.println("Enter product brand name:");
			String brand=s.next();
			List<Product> p=dao.findByBrand(brand);
			if(p.isEmpty())
			{
				System.err.println("No Products with this brand");
			}
			else
			{
				for (Product product : p) {
					System.out.println(product);
					
				}
			}
			break;
		}
		case 5:
		{
			System.out.println("Enter product category name:");
			String category=s.next();
			List<Product> p=dao.findBCategory(category);
			if(p.isEmpty())
			{
				System.err.println("No Products with this brand");
			}
			else
			{
				for (Product product : p) {
					System.out.println(product);
					
				}
			}
			break;
		}
		case 6:
		{
			System.out.println("Enter product name:");
			String name=s.next();
			List<Product> p=dao.findByName(name);
			if(p.isEmpty())
			{
				System.err.println("No Products with this brand");
			}
			else
			{
				for (Product product : p) {
					System.out.println(product);
					
				}
			}
			break;
		}
		case 7:
		{
			System.out.println("Enter Merchant is name:");
			int id=s.nextInt();
			List<Product> p=dao.findByMerchantId(id);
			if(p.isEmpty())
			{
				System.err.println("No Products with this brand");
			}
			else
			{
				for (Product product : p) {
					System.out.println(product);
					
				}
			}
			break;
		}
		case 8:
		{
			List<Product> p=dao.findAll();
			for (Product product : p) {
				System.out.println(product);
				
			}
			break;
		}
		case 9:
		{
			System.out.println("=====thank you Visit Again=======");
	        System.exit(0);
	        break;
		}
		default:System.out.println("Invalid Option.");
		
		
			
	
	
		
	}
	}

}
