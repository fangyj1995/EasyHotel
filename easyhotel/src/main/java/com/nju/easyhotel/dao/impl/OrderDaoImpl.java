package com.nju.easyhotel.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
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
	public List<OrderPo> getAllOrderByMember(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderPo> getAllOrderByHotel(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderPo> getMemberOrdersByState(String memberId, String state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OrderPo> getHotelOrdersByState(String hotelId, String state) {
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
	private static final class OrderRowMapper implements RowMapper<OrderPo>{
		@Override
		public OrderPo mapRow(ResultSet rs, int rowNum) throws SQLException {			
			OrderPo order=new OrderPo();
			order.setId(rs.getString("id"));
			order.setMemberId(rs.getString("member_key"));
			order.setHotelId(rs.getString("hotel_key"));
			order.setStartDate(rs.getDate("expect_checkin_time"));
			order.setEndDate(rs.getDate("expect_checkout_time"));
			order.setCheckInTime(rs.getTimestamp("checkin_time"));
			order.setCheckOutTime(rs.getTimestamp("checkout_time"));
			order.setLatestExecutionTime(rs.getTimestamp("latest_execution_time"));
			order.setRoomTypeId(rs.getString("room_type_key"));
			order.setRoomNum(rs.getInt("room_num"));
			order.setChildren(rs.getInt("customer_num"));
			order.setWithdrawTime(rs.getTimestamp("withdraw_time"));
			order.setHotelPromoId(rs.getString("hotel_promotion_key"));
			order.setWebPromoId(rs.getString("web_promotion_key"));
			order.setPrice(rs.getDouble("price"));
			order.setState(rs.getString("state"));
			return order;
		}		
	}

}
