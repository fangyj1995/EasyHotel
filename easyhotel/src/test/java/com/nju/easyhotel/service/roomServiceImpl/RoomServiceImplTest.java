package com.nju.easyhotel.service.roomServiceImpl;

import static org.junit.Assert.*;

import java.util.Iterator;
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
import com.nju.easyhotel.service.RoomService;
import com.nju.easyhotel.service.hotelServiceImpl.HotelSearchResultVo;
import com.nju.easyhotel.vo.RoomTypeVo;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class RoomServiceImplTest {
	@Autowired
	private RoomService roomService;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetAllRoomsByHotel() {
		List<RoomTypeVo> rooms=roomService.getAllRoomsByHotel("1");
		assertNotNull(rooms);
		Iterator<RoomTypeVo> iter=rooms.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
