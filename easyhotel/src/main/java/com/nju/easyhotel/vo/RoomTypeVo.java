package com.nju.easyhotel.vo;

public class RoomTypeVo {

	private String type;
	private double price;
	private int total;//这个类型的房间总数
	private int bedNum;
	
	public RoomTypeVo() {
		super();
	}
	public RoomTypeVo(String type, double price, int total, int bedNum) {
		super();
		this.type = type;
		this.price = price;
		this.total = total;
		this.bedNum = bedNum;
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
	public String toString(){
		return type+" ￥"+price+" "+" 床数"+bedNum+" 总数量："+total;
	}
}
