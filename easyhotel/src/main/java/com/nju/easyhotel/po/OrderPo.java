package com.nju.easyhotel.po;

import java.util.Date;

public class OrderPo {

	private String id;
	private String memberId;
	private String hotelId;
	private Date startDate;
	private Date endDate;
	private Date checkInTime;
	private Date checkOutTime;
	private Date latestExecutionTime;
	private String roomTypeId;
	private int roomNum;
	private int children;
	private String state;
	private Date withdrawTime;
	private String hotelPromoId;
	private String webPromoId;
	private double price;
	public OrderPo(String id, String memberId, String hotelId, Date startDate, Date endDate, Date checkInTime,
			Date checkOutTime, Date latestExecutionTime, String roomTypeId, int roomNum, int children, String state,
			Date withdrawTime, String hotelPromoId, String webPromoId, double price) {
		super();
		this.id = id;
		this.memberId = memberId;
		this.hotelId = hotelId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
		this.latestExecutionTime = latestExecutionTime;
		this.roomTypeId = roomTypeId;
		this.roomNum = roomNum;
		this.children = children;
		this.state = state;
		this.withdrawTime = withdrawTime;
		this.hotelPromoId = hotelPromoId;
		this.webPromoId = webPromoId;
		this.price = price;
	}
	public OrderPo() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getHotelId() {
		return hotelId;
	}
	public void setHotelId(String hotelId) {
		this.hotelId = hotelId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(Date checkInTime) {
		this.checkInTime = checkInTime;
	}
	public Date getCheckOutTime() {
		return checkOutTime;
	}
	public void setCheckOutTime(Date checkOutTime) {
		this.checkOutTime = checkOutTime;
	}
	public Date getLatestExecutionTime() {
		return latestExecutionTime;
	}
	public void setLatestExecutionTime(Date latestExecutionTime) {
		this.latestExecutionTime = latestExecutionTime;
	}
	public String getRoomTypeId() {
		return roomTypeId;
	}
	public void setRoomTypeId(String roomTypeId) {
		this.roomTypeId = roomTypeId;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
	public int getChildren() {
		return children;
	}
	public void setChildren(int children) {
		this.children = children;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getWithdrawTime() {
		return withdrawTime;
	}
	public void setWithdrawTime(Date withdrawTime) {
		this.withdrawTime = withdrawTime;
	}
	public String getHotelPromoId() {
		return hotelPromoId;
	}
	public void setHotelPromoId(String hotelPromoId) {
		this.hotelPromoId = hotelPromoId;
	}
	public String getWebPromoId() {
		return webPromoId;
	}
	public void setWebPromoId(String webPromoId) {
		this.webPromoId = webPromoId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "OrderPo [id=" + id + ", memberId=" + memberId + ", hotelId=" + hotelId + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", checkInTime=" + checkInTime + ", checkOutTime=" + checkOutTime
				+ ", latestExecutionTime=" + latestExecutionTime + ", roomTypeId=" + roomTypeId + ", roomNum=" + roomNum
				+ ", children=" + children + ", state=" + state + ", withdrawTime=" + withdrawTime + ", hotelPromoId="
				+ hotelPromoId + ", webPromoId=" + webPromoId + ", price=" + price + "]";
	}
	
}
