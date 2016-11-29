package com.nju.easyhotel.dao;


import java.util.Date;
import java.util.List;

import com.nju.easyhotel.po.HotelPo;
import com.nju.easyhotel.po.HotelSearchResultPo;

public interface HotelDao {

	List<HotelSearchResultPo> searchHotel(
			 String name
			,Date startDate
			,Date endDate
			,String roomType
			,int roomNum
			,String sortType
			,String city
			,String circle);
	HotelPo  getHotelById(String hotelId);
	int  insertHotelComment(String hotelId,String comment,double rate);
	int  deleteHotel(String hotelId);
	int  insertHotel(HotelPo hotelPo);
	int  modifyHotel(HotelPo hotelPo);
	int  changeHotelAvaRate(double rate);
	
}
