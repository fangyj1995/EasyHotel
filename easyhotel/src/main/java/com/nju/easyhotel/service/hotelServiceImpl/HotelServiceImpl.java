package com.nju.easyhotel.service.hotelServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nju.easyhotel.dao.HotelDao;
import com.nju.easyhotel.po.HotelPo;
import com.nju.easyhotel.service.HotelService;
import com.nju.easyhotel.vo.HotelDetailVo;
import com.nju.easyhotel.vo.HotelSearchResultVo;
import com.nju.easyhotel.vo.HotelVo;
import com.nju.easyhotel.vo.SearchForm;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
	private HotelDao hotelDao;
    

	public List<HotelSearchResultVo> searchHotel(SearchForm searchForm) {
		
		List<HotelPo> tempList=hotelDao.searchHotel(
				searchForm.getName(), 
				searchForm.getStartDate(), 
				searchForm.getEndDate(), 
				searchForm.getRoomKind(), 
				searchForm.getRoomNum(), 
				searchForm.getSortCondition());
		
		List<HotelSearchResultVo> resultList=new ArrayList<HotelSearchResultVo>();
		
		for(int i=0;i<tempList.size();i++){
			HotelPo p=tempList.get(i);
			resultList.add(new HotelSearchResultVo(
					p.getHotel_id(),
					p.getHotel_name(), 
					p.getHotel_address(), 
					p.getHotel_starLevel(), 
					p.getHotel_avgRate(),
					p.getHotel_roomNum()
					)
					);
		}
		sort(searchForm.getSortCondition(),resultList);
		return resultList;
	}	
	
	
	public HotelDetailVo getHotel(String id) {
		// TODO Auto-generated method stub
		HotelPo p=hotelDao.getHotelById(id);
		//System.out.println(p);
		return new HotelDetailVo(
				p.getHotel_id(),
				p.getHotel_name(), 
				p.getHotel_address(), 
				p.getHotel_starLevel(), 
				p.getHotel_avgRate(),
				p.getHotel_roomNum(),
				p.getHotel_des()
				);
		//List<RoomPo> rl=roomDao.getRoomsByHotel(id);
	}
	
	
    private List<HotelSearchResultVo> sort(String condition,List<HotelSearchResultVo> list){
    	if(condition==null||condition.equals(""))
    		condition="price";
    	if(condition.equals("price")){
    		list.sort(HotelComparator.price());
    	}
    	else if(condition.equals("rate")){
    		list.sort(HotelComparator.rate());
    	}
    	else
    		list.sort(HotelComparator.starLevel());   	
    	return list;
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
