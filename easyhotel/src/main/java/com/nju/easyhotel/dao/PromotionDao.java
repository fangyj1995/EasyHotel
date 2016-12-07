package com.nju.easyhotel.dao;

import java.util.List;

import com.nju.easyhotel.po.HotelPromotionPo;
import com.nju.easyhotel.po.WebMarketerPo;
import com.nju.easyhotel.po.WebPromotionPo;

public interface PromotionDao {

	int insertWebPromotion(WebPromotionPo promo);
	int modifyWebPromotion(WebPromotionPo promo);
	
	int insertHotelPromotion(HotelPromotionPo promo);
	int modifyHotelPromotion(HotelPromotionPo promo);
	
	List<HotelPromotionPo> getPromotionListByHotel(String hotelId);
	List<WebMarketerPo> getWebSitePromotionList();
}
