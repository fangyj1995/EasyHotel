package com.nju.easyhotel.service;

import com.nju.easyhotel.vo.HotelManagerVo;
import com.nju.easyhotel.vo.MemberVo;
import com.nju.easyhotel.vo.WebManagerVo;
import com.nju.easyhotel.vo.WebMarketerVo;

public interface LoginService {

	MemberVo memberLogin(String username,String pwd);
	HotelManagerVo hotelLogin(String username,String pwd);
	WebManagerVo managerLogin(String username,String pwd);
	WebMarketerVo marketerLogin(String username,String pwd);
	
	int logOut(String username);
	int memberLogOut(String username);
	int hotelLogOut(String username);
	int managerLogOut(String username);
	int marketerLogOut(String username);
	
	int signIn(String username,String pwd);
}
