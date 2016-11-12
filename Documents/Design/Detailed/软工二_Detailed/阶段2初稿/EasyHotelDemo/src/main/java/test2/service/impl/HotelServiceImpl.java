package test2.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test2.dao.HotelDao;
import test2.po.HotelPo;
import test2.service.HotelService;
import test2.vo.HotelDetailVo;
import test2.vo.HotelSearchResultVo;
import test2.vo.SearchForm;

@Service
public class HotelServiceImpl implements HotelService{
    @Autowired
	private HotelDao hotelDao;
    
	@Override
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
	
	@Override
	public HotelDetailVo getHotel(String id) {
		// TODO Auto-generated method stub
		HotelPo p=hotelDao.getHotel(id);
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
}
