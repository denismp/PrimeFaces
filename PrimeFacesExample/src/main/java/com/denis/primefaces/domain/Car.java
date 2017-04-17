package com.denis.primefaces.domain;

public class Car {
	private String id;
	private String brand;
	private Integer year;
	private String color;
	private Integer mileage;
	private Boolean sold;
	
	public Car( String vin, String brand, Integer year, String color, Integer mileage, Boolean sold){
		this.id = vin;
		this.brand = brand;
		this.year = year;
		this.color = color;
		this.mileage = mileage;
		this.sold = sold;
	}
	public String getId() {
		return id;
	}
	public void setId(String vin) {
		this.id = vin;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getMileage() {
		return mileage;
	}
	public void setMileage(Integer mileage) {
		this.mileage = mileage;
	}
	public Boolean getSold() {
		return sold;
	}
	public void setSold(Boolean sold) {
		this.sold = sold;
	}
	

}
