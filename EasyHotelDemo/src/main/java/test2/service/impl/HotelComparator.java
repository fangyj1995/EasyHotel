package test2.service.impl;

import java.util.Comparator;

import test2.vo.HotelSearchResultVo;
public class HotelComparator{
   public static Comparator<HotelSortInfo> price(){
	   return new Comparator<HotelSortInfo>(){

		@Override
		public int compare(HotelSortInfo o1, HotelSortInfo o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		   
	   };
   }
   public static Comparator<HotelSortInfo> rate(){
	   return new Comparator<HotelSortInfo>(){

		@Override
		public int compare(HotelSortInfo o1, HotelSortInfo o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		   
	   };
   }
   public static Comparator<HotelSortInfo> starLevel(){
	   return new Comparator<HotelSortInfo>(){

		@Override
		public int compare(HotelSortInfo o1, HotelSortInfo o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		   
	   };
   }
}

