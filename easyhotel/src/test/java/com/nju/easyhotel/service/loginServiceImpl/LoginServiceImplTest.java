package com.nju.easyhotel.service.loginServiceImpl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.nju.easyhotel.Application;
import com.nju.easyhotel.service.LoginService;
import com.nju.easyhotel.vo.HotelManagerVo;
import com.nju.easyhotel.vo.MemberVo;
import com.nju.easyhotel.vo.WebManagerVo;
import com.nju.easyhotel.vo.WebMarketerVo;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class LoginServiceImplTest {

	@Autowired
	private LoginService loginService;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		MemberVo member=loginService.memberLogin("user1", "1234");
		HotelManagerVo hotelManager=loginService.hotelLogin("hotelmanager1", "1234");
		WebManagerVo manager=loginService.managerLogin("manager1", "1234");
		WebMarketerVo markerter=loginService.marketerLogin("marketer1", "1234");
		if(member!=null) 
			System.out.println(member);
		else 
			System.out.println("会员登录失败");
		if(hotelManager!=null)
			System.out.println(hotelManager);
		else 
			System.out.println("酒店工作人员登录失败");
		if(manager!=null)
			System.out.println(manager);
		else 
			System.out.println("网站管理人员登录失败");
		if(markerter!=null)
			System.out.println(markerter);
		else 
			System.out.println("网站营销人员登录失败");
		
	}

}
