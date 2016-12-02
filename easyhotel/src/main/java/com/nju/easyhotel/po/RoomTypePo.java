package com.nju.easyhotel.po;

public class RoomTypePo {
	private String roomId;
	private String hotelId;
	private String type;
	private double price;
	private int total;//这个类型的房间总数
	private int bedNum;
	
	public RoomTypePo() {
		super();
	}

	public RoomTypePo(String roomId, String hotelId, String type, double price, int total, int bedNum) {
		super();
		this.roomId = roomId;
		this.hotelId = hotelId;
		this.type = type;
		this.price = price;
		this.total = total;
		this.bedNum = bedNum;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public String getHotelId() {
		return hotelId;
	}

	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
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
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getBedNum() {
		return bedNum;
	}
	public void setBedNum(int bedNum) {
		this.bedNum = bedNum;
	}
	
}
