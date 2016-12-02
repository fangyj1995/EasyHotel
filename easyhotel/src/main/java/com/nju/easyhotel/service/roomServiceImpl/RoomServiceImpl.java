package com.nju.easyhotel.service.roomServiceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nju.easyhotel.dao.RoomDao;
import com.nju.easyhotel.po.RoomTypePo;
import com.nju.easyhotel.service.RoomService;
import com.nju.easyhotel.vo.RoomTypeVo;
@Service
public class RoomServiceImpl implements RoomService{
	@Autowired
	private RoomDao roomDao;
	@Override
	public List<RoomTypeVo> getAllRoomsByHotel(String hotelId) {
		List<RoomTypePo> poList=roomDao.getAllRoomsByHotel(hotelId);
		List<RoomTypeVo> rooms=new ArrayList<RoomTypeVo>();
		Iterator<RoomTypePo> iter=poList.iterator();
		while(iter.hasNext()){
			RoomTypePo po=(RoomTypePo) iter.next();
			rooms.add(new RoomTypeVo(po.getType(),po.getPrice(),po.getTotal(),po.getBedNum()));
		}
		return rooms;
	}

	@Override
	public int deleteRoom(String roomId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyRoom(RoomTypePo room) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addRoom(RoomTypePo room) {
		// TODO Auto-generated method stub
		return 0;
	}

}
