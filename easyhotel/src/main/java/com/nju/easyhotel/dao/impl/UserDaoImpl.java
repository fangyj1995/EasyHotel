package com.nju.easyhotel.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nju.easyhotel.dao.UserDao;
import com.nju.easyhotel.po.HotelManagerPo;
import com.nju.easyhotel.po.WebMarketerPo;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int insertWebMarketer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyWebMarketer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public WebMarketerPo getWebMarketerById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int checkWebMarketer(String memberName, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertHotelManager() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyHotelManager() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public HotelManagerPo getHotelManagerById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int checkHotelManager(String memberName, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}

}
