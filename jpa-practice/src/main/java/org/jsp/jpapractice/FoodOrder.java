package org.jsp.jpapractice;
import java.time.LocalDateTime;
import javax.persistence.*;
import javax.persistence.Entity;
import org.hibernate.annotations.*;
@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String food_item;
	@Column(nullable = false)
	private double cost;
	@CreationTimestamp
    private LocalDateTime oreder_time;
	@UpdateTimestamp
    private LocalDateTime deliviry_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFood_item() {
		return food_item;
	}
	public void setFood_item(String food_item) {
		this.food_item = food_item;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LocalDateTime getOreder_time() {
		return oreder_time;
	}
	public void setOreder_time(LocalDateTime oreder_time) {
		this.oreder_time = oreder_time;
	}
	public LocalDateTime getDeliviry_time() {
		return deliviry_time;
	}
	public void setDeliviry_time(LocalDateTime deliviry_time) {
		this.deliviry_time = deliviry_time;
	}
	
	

}
