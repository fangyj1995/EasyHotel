package com.nju.easyhotel.po;

import java.util.ArrayList;

public class HotelSearchResultPo {

	private String id;
	private String name;
	private String address;
	private int star_level;
	private double avg_grade;
	private String type;
	private double price;
	private int available;
	public HotelSearchResultPo(String id,String name, String address, int star_level, double avg_grade, String type, double price, int available) {
		super();
		this.id=id;
		this.name = name;
		this.address = address;
		this.star_level = star_level;
		this.avg_grade = avg_grade;
		this.type = type;
		this.price = price;
		this.available=available;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getStar_level() {
		return star_level;
	}
	public void setStar_level(int star_level) {
		this.star_level = star_level;
	}
	public double getAvg_grade() {
		return avg_grade;
	}
	public void setAvg_grade(double avg_grade) {
		this.avg_grade = avg_grade;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}


}
