package com.nju.easyhotel.vo;

public class HotelVo {
	private String id;
	private String name;
	private String address;
	private int starLevel;
	private double rate;
	private String description;//abstract 描述，摘要
	private String facilityService;
	private int roomNum;
	private String city;
	private String circle;
	
	public HotelVo() {
		super();
	}
	public HotelVo(String id, String name, String address, int starLevel, double rate, String description,
			String facilityService, int roomNum, String city, String circle) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.starLevel = starLevel;
		this.rate = rate;
		this.description = description;
		this.facilityService = facilityService;
		this.roomNum = roomNum;
		this.city = city;
		this.circle = circle;
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
	public int getStarLevel() {
		return starLevel;
	}
	public void setStarLevel(int starLevel) {
		this.starLevel = starLevel;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFacilityService() {
		return facilityService;
	}
	public void setFacilityService(String facilityService) {
		this.facilityService = facilityService;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCircle() {
		return circle;
	}
	public void setCircle(String circle) {
		this.circle = circle;
	}
	public String toString(){
		return id+" "+name+" "+address+" "+starLevel+"星  评分："+rate+" 描述："+description+" 设施："+facilityService+"房间数 "+roomNum+" "+city+" "+circle;
	}
}
