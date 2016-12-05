package com.nju.easyhotel.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nju.easyhotel.dao.OrderDao;

import com.nju.easyhotel.po.OrderPo;
import com.nju.easyhotel.tools.DateFormat;

@Repository
public class OrderDaoImpl implements OrderDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public int insertOrder(OrderPo orderPo) {
		String sql="insert into orders "
				+ "(id,member_key,hotel_key,expect_checkin_time,expect_checkout_time,"
				+ "checkin_time,checkout_time,latest_execution_time,"
				+ "room_type_key,room_num,customer_num,children,withdraw_time,"
				+ "hotel_promotion_key,web_promotion_key,price,state)"
				+ "values("
				+" "+orderPo.getId()+" , "
				+" "+orderPo.getMemberId()+" , "
				+" "+orderPo.getHotelId()+" , "
				+" '"+DateFormat.format(orderPo.getStartDate())+"' , "
				+" '"+DateFormat.format(orderPo.getEndDate())+"' , "
				+" '"+DateFormat.format(orderPo.getCheckInTime(),"yyyy-MM-dd HH:mm:ss")+"' , "
				+" '"+DateFormat.format(orderPo.getCheckOutTime(),"yyyy-MM-dd HH:mm:ss")+"' , "
				+" '"+DateFormat.format(orderPo.getLatestExecutionTime(),"yyyy-MM-dd HH:mm:ss")+"' , "
				+" "+orderPo.getRoomTypeId()+" , "
				+" "+orderPo.getRoomNum()+" , "
				+" "+orderPo.getCustomerNum()+" , "
				+" "+orderPo.getChildren()+" , "
				+" "+DateFormat.format(orderPo.getWithdrawTime(),"yyyy-MM-dd HH:mm:ss")+" , "
				+" "+orderPo.getHotelPromoId()+" , "
				+" "+orderPo.getWebPromoId()+" , "
				+" "+orderPo.getPrice()+" , "
				+" '"+orderPo.getState()+"' "
				+ ")";
		try{
			 int count=jdbcTemplate.update(sql);	
			 return count;	
			}
			catch(DataAccessException  e){
				e.printStackTrace();
				return 0;
			}
	}

	@Override
	public int deleteOrder(String orderId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int setOrderState(String orderId, String state) {
		String sql="update orders set state='"+state+"' where id="+orderId;
		
		try{
			 int count=jdbcTemplate.update(sql);	
			 return count;	
			}
			catch(DataAccessException  e){
				e.printStackTrace();
				return 0;
			}
	}

	@Override
	public List<OrderPo> getAllOrderByMember(String memberId) {
		String sql="select * from orders where member_key="+memberId;
		try{
			   List<OrderPo> order=jdbcTemplate.query(sql, new OrderRowMapper());
			   return order;
			}
			catch(IncorrectResultSizeDataAccessException  e){
				e.printStackTrace();
				return null;
		}
	}

	@Override
	public List<OrderPo> getAllOrderByHotel(String hotelId) {
		String sql="select * from orders where hotel_key="+hotelId;
		try{
			   List<OrderPo> order=jdbcTemplate.query(sql, new OrderRowMapper());
			   return order;
			}
			catch(IncorrectResultSizeDataAccessException  e){
				e.printStackTrace();
				return null;
		}
	}

	@Override
	public List<OrderPo> getMemberOrdersByState(String memberId, String state) {
		String sql="select * from orders where member_key="+memberId+" and state ='"+state+"'";
		try{
			   List<OrderPo> order=jdbcTemplate.query(sql, new OrderRowMapper());
			   return order;
			}
			catch(IncorrectResultSizeDataAccessException  e){
				e.printStackTrace();
				return null;
		}
	}

	@Override
	public List<OrderPo> getHotelOrdersByState(String hotelId, String state) {
		String sql="select * from orders where hotel_key="+hotelId+" and state ='"+state+"'";
		try{
			   List<OrderPo> order=jdbcTemplate.query(sql, new OrderRowMapper());
			   return order;
			}
			catch(IncorrectResultSizeDataAccessException  e){
				e.printStackTrace();
				return null;
		}
	}

	@Override
	public OrderPo getOrderById(String orderId) {
		String sql="select * from orders where id="+orderId; 
		try{
			   OrderPo order=jdbcTemplate.queryForObject(sql, new OrderRowMapper());
			   return order;
			}
			catch(IncorrectResultSizeDataAccessException  e){
				e.printStackTrace();
				return null;
			}
	}

	@Override
	public int setCheckInTime(String orderId, Date checkInTime) {
	    String sql="update orders set checkin_time='"+DateFormat.format(checkInTime)+"' where id="+orderId;
		
		try{
			 int count=jdbcTemplate.update(sql);	
			 return count;	
			}
			catch(DataAccessException  e){
				e.printStackTrace();
				return 0;
			}
	}

	@Override
	public int setCheckOutTime(String orderId, Date checkOutTime) {
        String sql="update orders set checkout_time='"+DateFormat.format(checkOutTime)+"' where id="+orderId;
		
		try{
			 int count=jdbcTemplate.update(sql);	
			 return count;	
			}
			catch(DataAccessException  e){
				e.printStackTrace();
				return 0;
			}
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
			
			order.setChildren(rs.getInt("children"));
			order.setWithdrawTime(rs.getTimestamp("withdraw_time"));
			order.setHotelPromoId(rs.getString("hotel_promotion_key"));
			order.setWebPromoId(rs.getString("web_promotion_key"));
			order.setPrice(rs.getDouble("price"));
			order.setState(rs.getString("state"));
			order.setCreatTime(rs.getTimestamp("creat_time"));
			return order;
		}		
	}

}
