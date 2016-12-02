package com.nju.easyhotel.dao;

import java.util.List;

import com.nju.easyhotel.po.RoomTypePo;

public interface RoomDao {

	int insertRoom(RoomTypePo room);
	int modifyRoom(RoomTypePo room);
	int deleteRoom(String roomId);
	RoomTypePo getRoom(String roomId);
	List<RoomTypePo> getAllRoomsByHotel(String hotelId);
	
}
