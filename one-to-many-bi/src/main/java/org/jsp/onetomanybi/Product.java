package org.jsp.onetomanybi;
import javax.persistence.*;
@Entity
public class Product {
	private int id;
	private String name,brand,catogery;
	private double cost;
	@JoinColumn(name="merchant_id")
	@ManyToOne
	private Merchant m;
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
	public String getCatogery() {
		return catogery;
	}
	public void setCatogery(String catogery) {
		this.catogery = catogery;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Merchant getM() {
		return m;
	}
	public void setM(Merchant m) {
		this.m = m;
	}
	
	

}
