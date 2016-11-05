package test2.po;

public class HotelPo {
	
public HotelPo(String hotel_id, String hotel_name, String hotel_city, String hotel_area, String hotel_address,
			int hotel_starLevel, double hotel_avgRate, String hotel_des, int hotel_roomNum) {
		super();
		this.hotel_id = hotel_id;
		this.hotel_name = hotel_name;
		this.hotel_city = hotel_city;
		this.hotel_area = hotel_area;
		this.hotel_address = hotel_address;
		this.hotel_starLevel = hotel_starLevel;
		this.hotel_avgRate = hotel_avgRate;
		this.hotel_des = hotel_des;
		this.hotel_roomNum = hotel_roomNum;
	}

private String hotel_id;
private String hotel_name;
private String hotel_city;
private String hotel_area;
private String hotel_address;
private int hotel_starLevel;
private double hotel_avgRate;
private String hotel_des;
private int hotel_roomNum;
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
public String getHotel_area() {
	return hotel_area;
}
public void setHotel_area(String hotel_area) {
	this.hotel_area = hotel_area;
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


}
