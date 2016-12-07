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
import com.nju.easyhotel.dao.OrderDao;
import com.nju.easyhotel.po.OrderPo;
import com.nju.easyhotel.service.orderServiceImpl.OrderDeal;
import com.nju.easyhotel.tools.DateFormat;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class OrderDaoImplTest {

	@Autowired
	private OrderDao orderDao;
	private OrderPo order1;
	private OrderPo order2;
	@Before
	public void setUp() throws Exception {
		order1=new OrderPo();		
		order1.setMemberId("1");
		order1.setHotelId("1");
		order1.setId(OrderDeal.getOrderId("1"));
		order1.setStartDate(DateFormat.format("2016-12-11"));
		order1.setEndDate(DateFormat.format("2016-12-12"));
		order1.setCheckInTime(DateFormat.format("2016-12-11 15:20:30", "yyyy-MM-dd HH:mm:ss"));
		order1.setCheckOutTime(DateFormat.format("2016-12-12 11:20:30", "yyyy-MM-dd HH:mm:ss"));
		order1.setLatestExecutionTime(DateFormat.format("2016-12-12 11:20:30", "yyyy-MM-dd HH:mm:ss"));
		order1.setRoomTypeId("1");
		order1.setRoomNum(1);
		order1.setCustomerNum(1);
		order1.setChildren(0);
		order1.setWithdrawTime(null);
		order1.setHotelPromoId(null);
		order1.setWebPromoId(null);
		order1.setPrice(199);
		order1.setState("未执行");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertOrder() {
		int i=orderDao.insertOrder(order1);
		System.out.println("测试插入订单:"+i+"记录受影响");
	}

	@Test
	public void testSetOrderState() {
		int i=orderDao.setOrderState("1", "已执行");
		System.out.println("测试修改订单状态:"+i+"记录受影响");
	}

	@Test
	public void testGetAllOrderByMember() {
		List<OrderPo> order=orderDao.getAllOrderByMember("1");
		System.out.println("测试获取客户订单：\n"+Arrays.toString(order.toArray()));
		
	}

	@Test
	public void testGetAllOrderByHotel() {
		List<OrderPo> order=orderDao.getAllOrderByHotel("1");
		System.out.println("测试获取酒店订单：\n"+Arrays.toString(order.toArray()));
		
	}

	@Test
	public void testGetMemberOrdersByState() {
		List<OrderPo> order=orderDao.getMemberOrdersByState("1", "未执行");
		System.out.println("测试获取客户指定状态订单：\n"+Arrays.toString(order.toArray()));
		
	}

	@Test
	public void testGetHotelOrdersByState() {
		List<OrderPo> order=orderDao.getHotelOrdersByState("1", "未执行");
		System.out.println("测试获取酒店指定状态订单：\n"+Arrays.toString(order.toArray()));
	}

	@Test
	public void testGetOrderById() {
		OrderPo order=orderDao.getOrderById("1");
		System.out.println("测试通过id获得订单信息\n"+order);
	}

	@Test
	public void testSetCheckInTime() {
		int i=orderDao.setCheckInTime("1", DateFormat.format("2016-12-10 15:22:30", "yyyy-MM-dd HH:mm:ss"));
		System.out.println("测试修改入住时间:"+i+"记录受影响");
	}

	@Test
	public void testSetCheckOutTime() {
		int i=orderDao.setCheckOutTime("1", DateFormat.format("2016-12-11 09:20:30", "yyyy-MM-dd HH:mm:ss"));
		System.out.println("测试修改退房时间:"+i+"记录受影响");
	}

}
