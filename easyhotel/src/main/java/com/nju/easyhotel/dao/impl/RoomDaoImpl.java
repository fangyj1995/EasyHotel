package com.nju.easyhotel.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nju.easyhotel.dao.RoomDao;
import com.nju.easyhotel.po.HotelPo;
import com.nju.easyhotel.po.HotelSearchResultPo;
import com.nju.easyhotel.po.RoomTypePo;

@Repository
public class RoomDaoImpl implements RoomDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public int insertRoom(RoomTypePo room) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyRoom(RoomTypePo room) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteRoom(String roomId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<RoomTypePo> getAllRoomsByHotel(String hotelId) {
		String sql="select * from room_type where hotel_key="+hotelId;
		List<RoomTypePo> rooms=jdbcTemplate.query(sql, new RoomTypeRowMapper());
		return rooms;
	}

	@Override
	public RoomTypePo getRoom(String roomId) {
		String sql="select * from room_type where id="+roomId;
		RoomTypePo po=jdbcTemplate.queryForObject(sql, new RoomTypeRowMapper());
		return po;
	}
	private static final class RoomTypeRowMapper implements RowMapper<RoomTypePo>{
		@Override
		public RoomTypePo mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new RoomTypePo(
					rs.getString("Id"),
					rs.getString("hotel_Key"),
					rs.getString("name"),
					rs.getDouble("price"),
					rs.getInt("count"),
					rs.getInt("bed")
					);
		}		
	}
}
