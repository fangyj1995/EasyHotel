package com.nju.easyhotel.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nju.easyhotel.dao.PromotionDao;
import com.nju.easyhotel.po.HotelPromotionPo;
import com.nju.easyhotel.po.WebPromotionPo;

@Repository
public class PromotionDaoImpl implements PromotionDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int insertWebPromotion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyWebPromotion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertHotelPromotion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyHotelPromotion() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<HotelPromotionPo> getPromotionListByHotel(String hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WebPromotionPo> getWebSitePromotionList() {
		// TODO Auto-generated method stub
		return null;
	}

}
