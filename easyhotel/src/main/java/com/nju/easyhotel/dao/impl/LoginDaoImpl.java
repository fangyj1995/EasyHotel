package com.nju.easyhotel.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nju.easyhotel.dao.LoginDao;
import com.nju.easyhotel.po.HotelManagerPo;
import com.nju.easyhotel.po.MemberPo;
import com.nju.easyhotel.po.WebManagerPo;
import com.nju.easyhotel.po.WebMarketerPo;
@Repository
public class LoginDaoImpl implements LoginDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public MemberPo memberLogin(String username, String pwd) {
		String sql="select member.*,member_level.name as level from member left join member_level on level_key=member_level.id where account='"+username+"' and password=password('"+pwd+"')";		
		try{
		   MemberPo member=jdbcTemplate.queryForObject(sql, new MemberRowMapper());
		   return member;
		}
		catch(IncorrectResultSizeDataAccessException  e){
			return null;
		}		
	}
	@Override
	public HotelManagerPo hotelLogin(String username, String pwd) {
		String sql="select * from hotel_stuff where account='"+username+"' and password=password('"+pwd+"')";		
		try{		
			HotelManagerPo manager=jdbcTemplate.queryForObject(sql, new HotelManagerRowMapper());		
			return manager;
		}
		catch(IncorrectResultSizeDataAccessException  e){
			return null;
		}
	}
	@Override
	public WebManagerPo managerLogin(String username, String pwd) {
		String sql="select * from web_manage_stuff where account='"+username+"'and password=password('"+pwd+"')";		
		try{		
			WebManagerPo manager=jdbcTemplate.queryForObject(sql, new WebManagerRowMapper());		
			return manager;
		}
		catch(IncorrectResultSizeDataAccessException  e){
			return null;
		}
	}

	@Override
	public WebMarketerPo marketerLogin(String username, String pwd) {
		String sql="select * from web_promotion_stuff where account='"+username+"' and password=password('"+pwd+"')";		
		try{	
			WebMarketerPo marketer=jdbcTemplate.queryForObject(sql, new WebMarketerRowMapper());	
			return marketer;
		}
		catch(IncorrectResultSizeDataAccessException  e){
			return null;
		}
	}
	
	@Override
	public int signIn(String username, String pwd) {
		return 0;
	}
	private static final class MemberRowMapper implements RowMapper<MemberPo>{
		@Override
		public MemberPo mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new MemberPo(
					rs.getString("id"),
					rs.getString("account"),
					rs.getString("name"),
					rs.getString("password"),
					rs.getString("contact"),
					rs.getString("type"),
					rs.getString("birthday"),
					rs.getString("enterprise"),
					rs.getInt("credit"),
					rs.getString("level")
					);
		}		
	}
	private static final class HotelManagerRowMapper implements RowMapper<HotelManagerPo>{
		@Override
		public HotelManagerPo mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new HotelManagerPo(
					rs.getString("id"),
					rs.getString("account"),
					rs.getString("password"),
					rs.getString("hotel_key")
					);
		}		
	}
	private static final class WebManagerRowMapper implements RowMapper<WebManagerPo>{
		@Override
		public WebManagerPo mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new WebManagerPo(
					rs.getString("id"),
					rs.getString("account"),
					rs.getString("password")
					);
		}		
	}
	private static final class WebMarketerRowMapper implements RowMapper<WebMarketerPo>{
		@Override
		public WebMarketerPo mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new WebMarketerPo(
					rs.getString("id"),
					rs.getString("account"),
					rs.getString("password")
					);
		}		
	}
}
