package com.nju.easyhotel.vo;

import com.nju.easyhotel.service.impl.HotelSortInfo;

public class HotelSearchResultVo implements HotelSortInfo{
private String id;
private String name;
private String address;
private int starLevel;
private double rate;
private int roomNum;
private int price;
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public int getRoomNum() {
	return roomNum;
}
public void setRoomNum(int roomNum) {
	this.roomNum = roomNum;
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


public HotelSearchResultVo(String id,String name, String address, int starLevel, double rate,int roomNum) {
	super();
	this.id=id;
	this.name = name;
	this.address = address;
	this.starLevel = starLevel;
	this.rate = rate;
	this.roomNum=roomNum;
}
@Override
public int sortByPrice() {
	// TODO Auto-generated method stub
	return this.getPrice();
}
@Override
public double sortByRate() {
	// TODO Auto-generated method stub
	return this.getRate();
}
@Override
public int sortByStarLevel() {
	// TODO Auto-generated method stub
	return this.getStarLevel();
}


}
