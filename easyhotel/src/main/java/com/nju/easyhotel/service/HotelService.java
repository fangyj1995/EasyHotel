package com.nju.easyhotel.service;

import java.util.List;

import com.nju.easyhotel.vo.HotelDetailVo;
import com.nju.easyhotel.vo.HotelSearchResultVo;
import com.nju.easyhotel.vo.HotelVo;
import com.nju.easyhotel.vo.SearchForm;

public interface HotelService {
	
   public List<HotelSearchResultVo> searchHotel(SearchForm searchForm);//搜索
   public HotelDetailVo getHotel(String id);//详情
   public int commentHotel();//评论
   public int deleteHotel(String id);//删除
   public int modifyHotel(HotelVo hotelvo);//修改
   public int addHotel(HotelVo hotelvo);//添加
}
