package com.nju.easyhotel.controller;
import org.springframework.beans.factory.annotation.Autowired;
//这个类负责处理录入客房，更新入住和退房信息的请求
import org.springframework.stereotype.Controller;

import com.nju.easyhotel.service.RoomService;
import com.nju.easyhotel.vo.RoomVo;

@Controller
public class RoomCon {

	@Autowired
	RoomService roomService;
	public String addRoom(RoomVo room){
		return "";
	}
	public String checkIn(String orderId){
		return "";
	}
	public String checkOut(String orderId){
		return "";
	}
}
