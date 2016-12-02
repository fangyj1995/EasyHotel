package com.nju.easyhotel.service.hotelServiceImpl;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.nju.easyhotel.Application;
import com.nju.easyhotel.service.HotelService;
import com.nju.easyhotel.tools.DateFormat;
import com.nju.easyhotel.vo.HotelVo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class HotelServiceImplTest {
	
	@Autowired
	private HotelService hotelService;
	private SearchForm form;
	
	@Before
	public void setUp(){
		form=new SearchForm("酒店",DateFormat.format("2016-12-29"),DateFormat.format("2016-12-30"),"",1,"price","南京","鼓楼区");			
	}
	
	@Test
	public void test() {
		List<HotelSearchResultVo> list=hotelService.searchHotel(form);
		Iterator<HotelSearchResultVo> iter=list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}		
		assertNotNull(list);
		HotelVo h=hotelService.getHotel("1");
		assertNotNull(h);
		System.out.println(h);
	}

}
