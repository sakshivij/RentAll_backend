package com.example.Rent;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Categories")
public class Item {

	double rentPerDay;
	double originalPrice;
	double deposit;
	boolean availability;
	String id;
	String name;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	String subcategory;
	String description;
	String category;
	String url;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getRentPerDay() {
		return rentPerDay;
	}
	public void setRentPerDay(double rentPerDay) {
		this.rentPerDay = rentPerDay;
	}
	public double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public double getDeposit() {
		return deposit;
	}
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubcategory() {
		return subcategory;
	}
	public void setSubcategory(String subcategory) {
		this.subcategory = subcategory;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Item(double rentPerDay, double originalPrice, double deposit, boolean availability, String id, String name,
			String subcategory, String description, String category, String url) {
		super();
		this.rentPerDay = rentPerDay;
		this.originalPrice = originalPrice;
		this.deposit = deposit;
		this.availability = availability;
		this.id = id;
		this.name = name;
		this.subcategory = subcategory;
		this.description = description;
		this.category = category;
		this.url = url;
	}
	
}
