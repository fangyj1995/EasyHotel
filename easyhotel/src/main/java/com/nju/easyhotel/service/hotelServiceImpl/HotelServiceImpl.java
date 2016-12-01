package com.nju.easyhotel.service.hotelServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nju.easyhotel.dao.HotelDao;
import com.nju.easyhotel.po.HotelPo;
import com.nju.easyhotel.po.HotelSearchResultPo;
import com.nju.easyhotel.service.HotelService;
import com.nju.easyhotel.vo.HotelVo;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
	private HotelDao hotelDao;
    
	public List<HotelSearchResultVo> searchHotel(SearchForm searchForm) {	
		List<HotelSearchResultPo> poList=hotelDao.searchHotel(
				searchForm.getName(), 
				searchForm.getStartDate(), 
				searchForm.getEndDate(), 
				searchForm.getRoomKind(), 
				searchForm.getRoomNum(), 
				searchForm.getSortCondition(), 
				searchForm.getCity(), 
				searchForm.getCircle()
				);			
		List<HotelSearchResultVo> list=SearchDeal.getResultList(poList);
		SearchDeal.sort("rate",list);
		return list;
	}			
	public HotelDetailVo getHotel(String id) {
		HotelPo p=hotelDao.getHotelById(id);
		return new HotelDetailVo(
				p.getHotel_id(),
				p.getHotel_name(), 
				p.getHotel_address(), 
				p.getHotel_starLevel(), 
				p.getHotel_avgRate(),
				p.getHotel_roomNum(),
				p.getHotel_des()
				);		
	}
	
	



	@Override
	public int commentHotel() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int deleteHotel(String id) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int modifyHotel(HotelVo hotelvo) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int addHotel(HotelVo hotelvo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
