package com.nju.easyhotel.service.hotelServiceImpl;

import java.util.List;

public class HotelDetailVo {
	private String id;
	private String name;
	private String address;
	private int starLevel;
	private double rate;
	private int roomNum;
	private String description;
	private List<RoomVo> roomList;
	
	public class RoomVo{
		String roomKind;
		String price;
		String restNumber;
		public RoomVo(String roomKind, String price, String restNumber) {
			super();
			this.roomKind = roomKind;
			this.price = price;
			this.restNumber = restNumber;
		}
		public String getRoomKind() {
			return roomKind;
		}
		public void setRoomKind(String roomKind) {
			this.roomKind = roomKind;
		}
		public String getPrice() {
			return price;
		}
		public void setPrice(String price) {
			this.price = price;
		}
		public String getRestNumber() {
			return restNumber;
		}
		public void setRestNumber(String restNumber) {
			this.restNumber = restNumber;
		}		
		
	}
	
	public HotelDetailVo(String id,String name, String address, int starLevel, double rate, int roomNum, String description) {
		super();
		this.id=id;
		this.name = name;
		this.address = address;
		this.starLevel = starLevel;
		this.rate = rate;
		this.roomNum = roomNum;
		this.description = description;
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
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
	
	
}
