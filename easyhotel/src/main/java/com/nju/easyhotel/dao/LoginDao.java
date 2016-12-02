package com.nju.easyhotel.dao;

import com.nju.easyhotel.po.HotelManagerPo;
import com.nju.easyhotel.po.MemberPo;
import com.nju.easyhotel.po.WebManagerPo;
import com.nju.easyhotel.po.WebMarketerPo;

public interface LoginDao {
	MemberPo memberLogin(String username,String pwd);
	HotelManagerPo hotelLogin(String username,String pwd);
	WebManagerPo managerLogin(String username,String pwd);
	WebMarketerPo marketerLogin(String username,String pwd);
	int signIn(String username,String pwd);
}
