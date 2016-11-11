package com.nju.easyhotel.dao;

import java.util.List;

import com.nju.easyhotel.po.HotelPromotionPo;
import com.nju.easyhotel.po.WebPromotionPo;

public interface PromotionDao {

	int insertWebPromotion();
	int modifyWebPromotion();
	
	int insertHotelPromotion();
	int modifyHotelPromotion();
	
	List<HotelPromotionPo> getPromotionListByHotel(String hotelId);
	List<WebPromotionPo> getWebSitePromotionList();
}
