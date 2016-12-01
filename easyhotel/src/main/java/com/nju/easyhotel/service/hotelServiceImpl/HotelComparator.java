package com.nju.easyhotel.service.hotelServiceImpl;

import java.util.Comparator;
public class HotelComparator{
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

