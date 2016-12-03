package com.nju.easyhotel.dao;

import java.util.Date;
import java.util.List;

import com.nju.easyhotel.po.OrderPo;


public interface OrderDao {
	public int insertOrder(OrderPo orderPo);
	public int deleteOrder(String orderId);
	public int setOrderState(String orderId,String state);
	
	public List<OrderPo> getAllOrderByMember(String memberId);
	public List<OrderPo> getAllOrderByHotel(String hotelId);
	
	public List<OrderPo> getMemberOrdersByState(String memberId,String state);
	public List<OrderPo> getHotelOrdersByState(String hotelId,String state);
	
	public OrderPo getOrderById(String orderId);
	
	public int setCheckInTime(String orderId,Date checkInTime);
	public int setCheckOutTime(String orderId,Date checkOutTime);
}
