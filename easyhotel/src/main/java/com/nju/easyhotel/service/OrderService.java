package com.nju.easyhotel.service;

import java.util.List;

import com.nju.easyhotel.vo.OrderVo;

public interface OrderService {
	public int placeOrder();
	public List<OrderVo> memberOrderLists(String userId);
	public List<OrderVo> hotelOrderLists(String hotelId);
	public int revokeOrder(String orderId);
	public int executeOrder(String orderId);
}
