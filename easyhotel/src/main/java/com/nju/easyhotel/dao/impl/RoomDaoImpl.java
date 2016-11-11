package com.nju.easyhotel.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nju.easyhotel.dao.RoomDao;
import com.nju.easyhotel.po.RoomPo;

@Repository
public class RoomDaoImpl implements RoomDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int insertRoom(RoomPo room) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<RoomPo> getRoomListByHotel(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRoomAvailableNum(String roomId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deRoomAvaliableNum(String roomId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int inRoomAvaliableNum(String roomId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
