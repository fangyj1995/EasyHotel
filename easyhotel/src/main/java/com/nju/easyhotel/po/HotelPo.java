package com.nju.easyhotel.po;

public class HotelPo {
	
	private String hotel_id;
	private String hotel_name;
	private String hotel_city;
	private String hotel_circle;
	private String hotel_address;
	private int hotel_starLevel;
	private double hotel_avgRate;
	private String hotel_des;
	private int hotel_roomNum;
	private String facilit_service;
	
	public HotelPo() {
		super();
	}
	public HotelPo(String hotel_id, String hotel_name, String hotel_city, String hotel_circle, String hotel_address,
			int hotel_starLevel, double hotel_avgRate, String hotel_des, int hotel_roomNum,String facilit_service) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.hotel_city = hotel_city;
		this.hotel_circle = hotel_circle;
		this.hotel_address = hotel_address;
		this.hotel_starLevel = hotel_starLevel;
		this.hotel_avgRate = hotel_avgRate;
		this.hotel_des = hotel_des;
		this.hotel_roomNum = hotel_roomNum;
		this.facilit_service=facilit_service;
	}
	public String getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(String hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getHotel_city() {
		return hotel_city;
	}
	public void setHotel_city(String hotel_city) {
		this.hotel_city = hotel_city;
	}
	public String getHotel_circle() {
		return hotel_circle;
	}
	public void setHotel_circle(String hotel_circle) {
		this.hotel_circle = hotel_circle;
	}
	public String getHotel_address() {
		return hotel_address;
	}
	public void setHotel_address(String hotel_address) {
		this.hotel_address = hotel_address;
	}
	public int getHotel_starLevel() {
		return hotel_starLevel;
	}
	public void setHotel_starLevel(int hotel_starLevel) {
		this.hotel_starLevel = hotel_starLevel;
	}
	public double getHotel_avgRate() {
		return hotel_avgRate;
	}
	public void setHotel_avgRate(double hotel_avgRate) {
		this.hotel_avgRate = hotel_avgRate;
	}
	public String getHotel_des() {
		return hotel_des;
	}
	public void setHotel_des(String hotel_des) {
		this.hotel_des = hotel_des;
	}
	public int getHotel_roomNum() {
		return hotel_roomNum;
	}
	public void setHotel_roomNum(int hotel_roomNum) {
		this.hotel_roomNum = hotel_roomNum;
	}
	public String getFacilit_service() {
		return facilit_service;
	}
	public void setFacilit_service(String facilit_service) {
		this.facilit_service = facilit_service;
	}
	@Override
	public String toString() {
		return "HotelPo [hotel_id=" + hotel_id + ", hotel_name=" + hotel_name + ", hotel_city=" + hotel_city
				+ ", hotel_circle=" + hotel_circle + ", hotel_address=" + hotel_address + ", hotel_starLevel="
				+ hotel_starLevel + ", hotel_avgRate=" + hotel_avgRate + ", hotel_des=" + hotel_des + ", hotel_roomNum="
				+ hotel_roomNum + ", facilit_service=" + facilit_service + "]";
	}



}
