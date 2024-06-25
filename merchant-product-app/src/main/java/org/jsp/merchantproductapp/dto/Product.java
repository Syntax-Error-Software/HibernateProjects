package org.jsp.merchantproductapp.dto;
import javax.persistence.*;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String name,brand,category,image_url;
	@Column(nullable = false)
	private double cost;
	@ManyToOne
	@JoinColumn(name="merchants_products")
	private Merchant merchants;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Merchant getMerchants() {
		return merchants;
	}

	public void setMerchants(Merchant merchants) {
		this.merchants = merchants;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", brand=" + brand + ", category=" + category + ", image_url="
				+ image_url + ", cost=" + cost + "]";
	}
	
	
	
	

}
