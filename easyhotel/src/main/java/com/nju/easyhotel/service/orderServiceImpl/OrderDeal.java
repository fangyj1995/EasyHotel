package com.nju.easyhotel.service.orderServiceImpl;

import java.util.Date;

import com.nju.easyhotel.tools.DateFormat;

public class OrderDeal {

	public static String getOrderId(String memberId){
		return DateFormat.format(new Date(), "yyyyMMddHHmmss")+memberId;
	}
}
