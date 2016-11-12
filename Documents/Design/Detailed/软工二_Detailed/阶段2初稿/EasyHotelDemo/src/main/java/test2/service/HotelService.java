package test2.service;

import java.util.List;

import test2.vo.HotelDetailVo;
import test2.vo.HotelSearchResultVo;
import test2.vo.SearchForm;

public interface HotelService {
	
public List<HotelSearchResultVo> searchHotel(SearchForm searchForm);
public HotelDetailVo getHotel(String id);
}
