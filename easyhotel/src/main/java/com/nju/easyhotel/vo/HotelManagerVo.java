package com.nju.easyhotel.vo;

public class HotelManagerVo {
	private String id;
	private String account;
	private String password;
	private String hotelId;
	public HotelManagerVo(String id, String account, String password, String hotelId) {
		super();
		this.id = id;
		this.account = account;
		this.password = password;
		this.hotelId = hotelId;
	}
	public HotelManagerVo() {
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
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	@Override
	public String toString() {
		return "HotelManagerVo [id=" + id + ", account=" + account + ", password=" + password + ", hotel_key="
				+ hotelId + "]";
	}
	
}
