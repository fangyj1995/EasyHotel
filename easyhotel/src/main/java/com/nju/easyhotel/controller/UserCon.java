package com.nju.easyhotel.controller;
import org.springframework.beans.factory.annotation.Autowired;
//这个类处理添加，删除，修改用户的请求
import org.springframework.stereotype.Controller;

import com.nju.easyhotel.service.UserService;
import com.nju.easyhotel.vo.HotelManagerVo;
import com.nju.easyhotel.vo.WebMarketerVo;


@Controller
public class UserCon {

	
	
	//网站营销人员
	public String WebMarketerInfo(String userId){
		return "";
	}
	public String addWebMarketer(WebMarketerVo webMarketer){
		return "";
	}	
	public String modifyWebMarketer(WebMarketerVo webMarketer){
		return "";
	}
	//酒店工作人员
	public String HotelManagerInfo(String userId){
		return "";
	}
	public String addHotelManager(HotelManagerVo hotelManager){
		return "";
	}
	public String modifyHotelManager(HotelManagerVo hotelManager){
		return "";
	}
}
