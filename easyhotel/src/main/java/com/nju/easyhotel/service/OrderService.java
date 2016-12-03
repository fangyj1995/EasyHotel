package com.nju.easyhotel.service;

import java.util.List;

import com.nju.easyhotel.vo.OrderVo;

public interface OrderService {
	public int placeOrder(OrderVo order);
	
	public List<OrderVo> getAllOrderByMember(String memberId);	
	public List<OrderVo> getAllOrderByHotel(String hotelId);
	
	public List<OrderVo> getMemberOrdersByState(String memberId,String state);
	public List<OrderVo> getHotelOrdersByState(String hotelId,String state);
	
	public OrderVo getOrderById(String orderId);
	
	public int revokeOrder(String orderId);
	public int executeOrder(String orderId);
}
