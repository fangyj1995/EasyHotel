package com.nju.easyhotel.service.loginServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nju.easyhotel.dao.LoginDao;
import com.nju.easyhotel.po.HotelManagerPo;
import com.nju.easyhotel.po.MemberPo;
import com.nju.easyhotel.po.WebManagerPo;
import com.nju.easyhotel.po.WebMarketerPo;
import com.nju.easyhotel.service.LoginService;
import com.nju.easyhotel.vo.HotelManagerVo;
import com.nju.easyhotel.vo.MemberVo;
import com.nju.easyhotel.vo.WebManagerVo;
import com.nju.easyhotel.vo.WebMarketerVo;
@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginDao loginDao;
	@Override
	public MemberVo memberLogin(String username, String pwd) {
		MemberPo po=loginDao.memberLogin(username, pwd);
		if(po==null) return null;
		MemberVo member=new MemberVo(
				po.getId(),
				po.getAccount(),
				po.getName(),
				po.getPassword(),
				po.getContact(),
				po.getType(),
				po.getBirthday(),
				po.getEnterprise(),
				po.getCredit(),
				po.getLevel());
		return member;
	}

	@Override
	public HotelManagerVo hotelLogin(String username, String pwd) {
		HotelManagerPo  po=loginDao.hotelLogin(username, pwd);
		if(po==null) return null;
		HotelManagerVo manager=new HotelManagerVo(
				po.getId(),
				po.getAccount(),
				po.getPassword(),
				po.getHotel_key()
				);
		return manager;
	}

	@Override
	public WebManagerVo managerLogin(String username, String pwd) {
		WebManagerPo  po=loginDao.managerLogin(username, pwd);
		if(po==null) return null;
		WebManagerVo manager=new WebManagerVo(
				po.getId(),
				po.getAccount(),
				po.getPassword()
				);
		return manager;
	}

	@Override
	public WebMarketerVo marketerLogin(String username, String pwd) {
		WebMarketerPo  po=loginDao.marketerLogin(username, pwd);
		if(po==null) return null;
		WebMarketerVo marketer=new WebMarketerVo(
				po.getId(),
				po.getAccount(),
				po.getPassword()
				);
		return marketer;
	}

	@Override
	public int logOut(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int memberLogOut(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hotelLogOut(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int managerLogOut(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int marketerLogOut(String username) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int signIn(String username, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}


}
