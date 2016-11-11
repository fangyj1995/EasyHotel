package com.nju.easyhotel.service;

public interface LoginService {

	int login(String username,String pwd);
	boolean isHotelManager();//用时是酒店管理员吗？
	boolean isMember();//用户是会员吗？
	boolean isWebMarketer();//用户是网站营销人员吗？
	boolean isWebManager();//用户是网站管理人员吗？
}
