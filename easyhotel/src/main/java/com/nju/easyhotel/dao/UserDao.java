package com.nju.easyhotel.dao;

import com.nju.easyhotel.po.HotelManagerPo;
import com.nju.easyhotel.po.WebMarketerPo;

public interface UserDao {

	int insertWebMarketer();
	int modifyWebMarketer();
	WebMarketerPo getWebMarketerById(String id);
	int checkWebMarketer(String memberName,String pwd);//验证用户名密码是否匹配
	
	int insertHotelManager();
	int modifyHotelManager();
	HotelManagerPo getHotelManagerById(String id);
	int checkHotelManager(String memberName,String pwd);//验证用户名密码是否匹配
	
}
