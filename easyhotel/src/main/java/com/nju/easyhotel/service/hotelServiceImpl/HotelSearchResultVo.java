package com.nju.easyhotel.service.hotelServiceImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HotelSearchResultVo implements HotelSortInfo{
	private String id;
	private String name;
	private String address;
	private int starLevel;
	private double avgGrade;
	private List<RoomInfo> rooms;		
	public HotelSearchResultVo(String id,String name, String address, int starLevel,double avg_grade) {
		super();
		this.id=id;
		this.name = name;
		this.address = address;
		this.starLevel = starLevel;
		this.avgGrade=avg_grade;
		this.rooms=new ArrayList<RoomInfo>();		
	}
	
	public void addRoomInfo(String type, double price, int available){
		rooms.add(new RoomInfo(type,price,available));
	}
	public void sortRooms(){
		Collections.sort(rooms);
	}
	private double minPrice(){	
		Collections.sort(rooms);
		return rooms.get(0).getPrice();	
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getStarLevel() {
		return starLevel;
	}
	
	public double getAvgGrade() {
		return avgGrade;
	}

	public List<RoomInfo> getRooms() {
		return rooms;
	}

	@Override
	public double price() {
		return rooms.get(0).getPrice();
	}
	@Override
	public double rate() {
		return this.getAvgGrade();
	}
	@Override
	public int level() {
		return this.getStarLevel();
	}
	public String toString(){
		return id+" "+name+" "+address+" 星级："+starLevel+"  评分："+avgGrade+"\n"+Arrays.toString(rooms.toArray());
	}
	private class RoomInfo implements  Comparable<RoomInfo>{
		private String type;
		private double price;
		private int available;
		public RoomInfo(String type, double price, int available) {
			super();
			this.type = type;
			this.price = price;
			this.available = available;
		}
		public String getType() {
			return type;
		}
		public double getPrice() {
			return price;
		}
		public int getAvailable() {
			return available;
		}
		public String toString(){
			return type+"  ￥ "+price+"剩余："+available;
		}
		@Override
		public int compareTo(RoomInfo r) {
			
			if(price==r.price) return 0;
			else if(price<r.price) return -1;
			else return 1;
		}			
	}


}
