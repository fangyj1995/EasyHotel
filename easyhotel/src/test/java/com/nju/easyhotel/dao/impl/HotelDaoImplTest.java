package com.nju.easyhotel.dao.impl;

import static org.junit.Assert.*;

import java.util.Arrays;
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
import com.nju.easyhotel.po.HotelPo;
import com.nju.easyhotel.po.HotelSearchResultPo;

import com.nju.easyhotel.tools.DateFormat;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class HotelDaoImplTest {

	@Autowired
	private HotelDao hotelDao;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSearchHotel() {
		List<HotelSearchResultPo> list=hotelDao.searchHotel("酒店", DateFormat.format("2016-12-29"),DateFormat.format("2016-12-30"),"大床房",1,"","南京","鼓楼区");
	    System.out.println(Arrays.toString(list.toArray()));
	    list=hotelDao.searchHotel("Full", DateFormat.format("2016-12-29"),DateFormat.format("2016-12-30"),"",1,"","nanjing","gulou");
	    System.out.println(Arrays.toString(list.toArray()));
	}

	@Test
	public void testGetHotelById() {
		HotelPo hotel=hotelDao.getHotelById("1");
		System.out.println(hotel);
		assertNotNull(hotel);
	}

}
