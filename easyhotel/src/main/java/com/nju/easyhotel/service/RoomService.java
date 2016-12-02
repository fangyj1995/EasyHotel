package com.nju.easyhotel.service;

import java.util.List;

import com.nju.easyhotel.po.RoomTypePo;
import com.nju.easyhotel.vo.RoomTypeVo;

public interface RoomService {
	public List<RoomTypeVo> getAllRoomsByHotel (String hotelId);
	public int deleteRoom(String roomId);
	public int modifyRoom(RoomTypePo room);
	public int addRoom(RoomTypePo room);
	
}
