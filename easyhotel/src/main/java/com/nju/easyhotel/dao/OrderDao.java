package com.nju.easyhotel.dao;

import java.util.Date;
import java.util.List;

import com.nju.easyhotel.po.OrderPo;


public interface OrderDao {
	public int insertOrder(OrderPo orderPo);
	public int deleteOrder(String orderId);
	public int setOrderState(String orderId,String state);
	
	public List<OrderPo> getOrdersByMember(String memberId);
	public List<OrderPo> getOrdersByHotel(String hotelId);
	public OrderPo getOrderById(String orderId);
	
	public int setCheckInTime(String orderId,Date checkInTime);
	public int setCheckOutTime(String orderId,Date checkOutTime);
}
