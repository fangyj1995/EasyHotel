package com.nju.easyhotel.service;

import java.util.List;

import com.nju.easyhotel.vo.HotelDetailVo;
import com.nju.easyhotel.vo.HotelSearchResultVo;
import com.nju.easyhotel.vo.SearchForm;

public interface HotelService {
	
public List<HotelSearchResultVo> searchHotel(SearchForm searchForm);
public HotelDetailVo getHotel(String id);
}
