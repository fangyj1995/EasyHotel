package com.nju.easyhotel.controller;
import org.springframework.beans.factory.annotation.Autowired;
//这个类负责处理生成订单，客户浏览订单，酒店浏览订单，撤销订单，执行订单的请求
import org.springframework.stereotype.Controller;

import com.nju.easyhotel.service.OrderService;

@Controller
public class OrderCon {

	
	public String placeOrder(){//生成订单
		return "";
	}
	public String memberOrders(String userId){//客户订单
		return "";
	}
	public String hotelOrders(String hotelId){//酒店订单
		return "";
	}
	public String revokeOrder(String orderId){//撤销订单
		return "";
	}
	public String executeOrder(String orderId){//执行订单
		return "";
	}
}
