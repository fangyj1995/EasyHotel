package com.nju.easyhotel.dao.impl;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.nju.easyhotel.dao.HotelDao;
import com.nju.easyhotel.po.HotelPo;

@Repository
public class HotelDaoImpl implements HotelDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	private static final class HotelRowMapper implements RowMapper<HotelPo>{
		@Override
		public HotelPo mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			return new HotelPo(
					rs.getString("Id"),
					rs.getString("name"),
					rs.getString("city"),
					rs.getString("circle"),
					rs.getString("address"),
					rs.getInt("star_level"),
					rs.getDouble("avg_grade"),
					rs.getString("abstract"),
					rs.getInt("room_num")
					);
		}		
	}
	
	
	@Override
	public List<HotelPo> searchHotel(String name, Date startDate, Date endDate
			, String roomKind, int roomNum,String sortType) {
		// TODO Auto-generated method stub	
		return jdbcTemplate.query(
				"select * from hotel where name like '%"+name+"%'"
				, new HotelRowMapper());
	}

	@Override
	public int deleteHotel(String hotelId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertHotel(HotelPo hotelPo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyHotel(HotelPo hotelPo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HotelPo getHotelById(String hotelId) {
		return jdbcTemplate.queryForObject(
				"select * from hotel where id="+hotelId,
				new HotelRowMapper());
	}

	@Override
	public int insertHotelComment(String hotelId, String comment, double rate) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeHotelAvaRate(double rate) {
		// TODO Auto-generated method stub
		return 0;
	}




}
