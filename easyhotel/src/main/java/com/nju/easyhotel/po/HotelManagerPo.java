package com.nju.easyhotel.po;

public class HotelManagerPo {

	private String id;
	private String account;
	private String password;
	private String hotel_key;
	public HotelManagerPo(String id, String account, String password, String hotel_key) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.hotel_key = hotel_key;
	}
	public HotelManagerPo() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHotel_key() {
		return hotel_key;
	}
	public void setHotel_key(String hotel_key) {
		this.hotel_key = hotel_key;
	}
	
}
