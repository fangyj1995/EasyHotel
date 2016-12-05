package com.nju.easyhotel.service.orderServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nju.easyhotel.dao.MemberDao;
import com.nju.easyhotel.dao.OrderDao;
import com.nju.easyhotel.service.OrderService;
import com.nju.easyhotel.vo.OrderVo;
@Service
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderDao orderDao;

	@Override
	public int placeOrder(OrderVo order) {
		String id=OrderDeal.getOrderId(order.getMemberId());
		return 0;
	}

	@Override
	public List<OrderVo> getAllOrderByMember(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVo> getAllOrderByHotel(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVo> getMemberOrdersByState(String memberId, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderVo> getHotelOrdersByState(String hotelId, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderVo getOrderById(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int revokeOrder(String orderId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int executeOrder(String orderId) {
		// TODO Auto-generated method stub
		return 0;
	}


}
