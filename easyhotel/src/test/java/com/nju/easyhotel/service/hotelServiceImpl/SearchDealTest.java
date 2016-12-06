package com.nju.easyhotel.service.hotelServiceImpl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.nju.easyhotel.Application;
import com.nju.easyhotel.dao.HotelDao;
import com.nju.easyhotel.po.HotelSearchResultPo;
import com.nju.easyhotel.tools.DateFormat;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class SearchDealTest {
	@Autowired
	private HotelDao hotelDao;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		List<HotelSearchResultPo> list=hotelDao.searchHotel("酒店", DateFormat.format("2016-12-29"),DateFormat.format("2016-12-30"),"",1,"","南京","新街口地区");	    
		List<HotelSearchResultVo> list1=SearchDeal.getResultList(list);
		for(HotelSearchResultVo hotel:list1)
			 System.out.println(hotel);
		System.out.println("按价格排序:———————————————————————————————");
		SearchDeal.sort("price", list1);
		for(HotelSearchResultVo hotel:list1)
			 System.out.println(hotel);
		System.out.println("按星级排序:————————————————————————————————");
		SearchDeal.sort("star", list1);
		for(HotelSearchResultVo hotel:list1)
			 System.out.println(hotel);
		System.out.println("按评分排序:———————————————————————————————");
		SearchDeal.sort("rate", list1);
		for(HotelSearchResultVo hotel:list1)
			 System.out.println(hotel);
	}

}
