package com.myapp.vehicle.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="car_details")
public class Car {
	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", brand=" + brand + ", price=" + price + ", model=" + model + ", color=" + color
				+ "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int carNo;
	private String brand;
	private int price;
	private int model;
	private String color;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCarNo() {
		return carNo;
	}
	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

}
