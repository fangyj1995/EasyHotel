package com.nju.easyhotel.service.hotelServiceImpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.nju.easyhotel.po.HotelSearchResultPo;

public class SearchDeal {

	public static List<HotelSearchResultVo> getResultList(List<HotelSearchResultPo> poList){
	    Set<String> idSet=new HashSet<String>();
		List<HotelSearchResultVo> list=new ArrayList<HotelSearchResultVo>();
		int j=0;
		for(int i=0;i<poList.size();i++){		
			HotelSearchResultPo p=poList.get(i);		
			String hotelid=p.getId();	
			if(!idSet.contains(hotelid))
			{
				idSet.add(hotelid);			
				HotelSearchResultVo row=new HotelSearchResultVo
					(
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
    	//System.out.println(condition);
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
    	return list;
    }
}
class HotelComparator{
	   public static Comparator<HotelSortInfo> price(){
		   return new Comparator<HotelSortInfo>(){
			public int compare(HotelSortInfo o1, HotelSortInfo o2) {
				if(o1.price()==o2.price()) return 0;
				if(o1.price()<o2.price()) return -1;
				return 1;
			}		   
		   };
	   }
	   public static Comparator<HotelSortInfo> rate(){
		   return new Comparator<HotelSortInfo>(){
			public int compare(HotelSortInfo o1, HotelSortInfo o2) {
				if(o1.rate()==o2.rate()) return 0;
				if(o1.rate()>o2.rate()) return -1;
				return 1;
			}		   
		   };
	   }
	   public static Comparator<HotelSortInfo> starLevel(){
		   return new Comparator<HotelSortInfo>(){
			public int compare(HotelSortInfo o1, HotelSortInfo o2) {
				if(o1.level()==o2.level()) return 0;
				if(o1.level()>o2.level()) return -1;
				return 1;
			}		   
		   };
	   }
	}
