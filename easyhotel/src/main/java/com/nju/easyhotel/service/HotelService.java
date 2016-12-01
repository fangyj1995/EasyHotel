package com.nju.easyhotel.service;

import java.util.List;

import com.nju.easyhotel.service.hotelServiceImpl.HotelDetailVo;
import com.nju.easyhotel.service.hotelServiceImpl.HotelSearchResultVo;
import com.nju.easyhotel.service.hotelServiceImpl.SearchForm;
import com.nju.easyhotel.vo.HotelVo;

public interface HotelService {
	
   public List<HotelSearchResultVo> searchHotel(SearchForm searchForm);//搜索
   public HotelDetailVo getHotel(String id);//详情
   public int commentHotel();//评论
   public int deleteHotel(String id);//删除
   public int modifyHotel(HotelVo hotelvo);//修改
   public int addHotel(HotelVo hotelvo);//添加
}
