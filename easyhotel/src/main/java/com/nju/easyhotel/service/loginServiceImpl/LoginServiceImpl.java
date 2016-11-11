package com.nju.easyhotel.service.loginServiceImpl;

import org.springframework.stereotype.Service;

import com.nju.easyhotel.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService{

	@Override
	public int login(String username, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isHotelManager() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isMember() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWebMarketer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWebManager() {
		// TODO Auto-generated method stub
		return false;
	}

}
