package com.nju.easyhotel.dao;


import java.util.Date;
import java.util.List;

import com.nju.easyhotel.po.HotelPo;

public interface HotelDao {

	List<HotelPo> searchHotel(
			 String name
			,Date startDate
			,Date endDate
			,String roomType
			,int roomNum
			,String sortType);
	HotelPo  getHotelById(String hotelId);
	int  insertHotelComment(String hotelId,String comment,double rate);
	int  deleteHotel(String hotelId);
	int  insertHotel(HotelPo hotelPo);
	int  modifyHotel(HotelPo hotelPo);
	int  changeHotelAvaRate(double rate);
}
