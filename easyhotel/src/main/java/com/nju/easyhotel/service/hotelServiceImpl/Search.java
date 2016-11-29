package com.nju.easyhotel.service.hotelServiceImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.nju.easyhotel.po.HotelSearchResultPo;
import com.nju.easyhotel.vo.HotelSearchResultVo;

public class Search {

	public static List<HotelSearchResultVo> getResultList(List<HotelSearchResultPo> poList){
	    Set<String> id=new HashSet<String>();
		List<HotelSearchResultVo> list=new ArrayList<HotelSearchResultVo>();
		int j=0;
		for(int i=0;i<poList.size();i++){		
			HotelSearchResultPo p=poList.get(i);		
			String hotelid=p.getId();	
			if(!id.contains(hotelid))
			{
				id.add(hotelid);			
				HotelSearchResultVo row=new HotelSearchResultVo(
						p.getId(),p.getName(),p.getAddress(),
						p.getStar_level(),p.getAvg_grade()
						);
				row.addRoomInfo(p.getType(), p.getPrice(), p.getAvailable());
				list.add(row);j++;
			}
			else{
				list.get(j-1).addRoomInfo(p.getType(), p.getPrice(), p.getAvailable());			
			}
	    }
		
		return list;
	}
    public static List<HotelSearchResultVo> sort(String condition,List<HotelSearchResultVo> list){
    	System.out.println(condition);
    	if(condition==null||condition.trim().equals(""))
    		condition="price";
    	if(condition.equals("price")){
    		list.sort(HotelComparator.price());
    	}
    	else if(condition.equals("rate")){
    		list.sort(HotelComparator.rate());
    	}
    	else
    		list.sort(HotelComparator.starLevel());   
    	System.out.println(list.get(0).getAvgGrade());
    	return list;
    }
}
