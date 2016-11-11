package com.nju.easyhotel.dao;

import java.util.List;

import com.nju.easyhotel.po.RoomPo;

public interface RoomDao {

	int insertRoom(RoomPo room);
	List<RoomPo> getRoomListByHotel(String hotelId);
	
	int getRoomAvailableNum(String roomId);//获得可用客房的数量
	int deRoomAvaliableNum(String roomId);//客房可用数量减一
	int inRoomAvaliableNum(String roomId);//客房可用数量加一
}
