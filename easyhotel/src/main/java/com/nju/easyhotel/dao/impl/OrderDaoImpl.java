package com.nju.easyhotel.dao.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nju.easyhotel.dao.OrderDao;
import com.nju.easyhotel.po.OrderPo;

@Repository
public class OrderDaoImpl implements OrderDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int insertOrder(OrderPo orderPo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOrder(String orderId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setOrderState(String orderId, String state) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<OrderPo> getOrdersByMember(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderPo> getOrdersByHotel(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderPo getOrderById(String orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int setCheckInTime(String orderId, Date checkInTime) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setCheckOutTime(String orderId, Date checkOutTime) {
		// TODO Auto-generated method stub
		return 0;
	}

}
