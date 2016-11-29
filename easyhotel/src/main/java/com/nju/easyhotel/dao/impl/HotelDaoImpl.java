package com.nju.easyhotel.dao.impl;

import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


import com.nju.easyhotel.dao.HotelDao;
import com.nju.easyhotel.po.HotelPo;
import com.nju.easyhotel.po.HotelSearchResultPo;
import com.nju.easyhotel.tools.DateFormat;

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
	public List<HotelSearchResultPo> searchHotel(String name, Date startDate, Date endDate
			, String roomType, int roomNum,String sortType,String city,String circle) {
	
		String sdate=DateFormat.format(startDate);
		String edate=DateFormat.format(endDate);
		String sql1="select * from("
				+ "select hotel.id,hotel.name as hotelname,address,star_level,avg_grade,room_type.name as roomname,room_type.price,room_type.count-ifnull(sum(orders.room_num),0) as avail "
				+ "from (room_type inner join hotel on room_type.hotel_key=hotel.id) left join orders on room_type.id=orders.room_type_key "
				+ "and "
				+ "('"
				+sdate+"' BETWEEN orders.expect_checkin_time and orders.expect_checkout_time "
				+ " or '"
				+edate+"' BETWEEN orders.expect_checkin_time and orders.expect_checkout_time "
				+ ")"
				+ "where hotel.name like '%"+name+"%' and hotel.city='"+city+"' and hotel.circle='"+circle+"' "
				+ "and room_type.name like '%"+roomType.trim()+"%' "
				+ "group by room_type.id"
				+ ") hotel "
				+ "where avail>0";
		System.out.println(sql1);
		List<HotelSearchResultPo> list;	
		list=jdbcTemplate.query(sql1, new RowMapper<HotelSearchResultPo>()
		{
			@Override
			public HotelSearchResultPo mapRow(ResultSet rs, int rowNum) throws SQLException {	
				HotelSearchResultPo r=new HotelSearchResultPo(
				rs.getString("id"),
				rs.getString("hotelname"),
				rs.getString("address"),
				rs.getInt("star_level"),
				rs.getDouble("avg_grade"),
				rs.getString("roomname"),
				rs.getDouble("price"),
				rs.getInt("avail")			
				);
				return r;
			}			
		}
		);	
		System.out.println(list.size());
		return list;
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
