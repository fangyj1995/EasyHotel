package com.nju.easyhotel.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nju.easyhotel.service.LoginService;
import com.nju.easyhotel.vo.HotelManagerVo;
import com.nju.easyhotel.vo.MemberVo;
import com.nju.easyhotel.vo.WebManagerVo;
import com.nju.easyhotel.vo.WebMarketerVo;

//这个类处理登录的请求
@Controller
public class LoginCon {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/easyhotel/login",method = RequestMethod.POST)
	public String login(
			@RequestParam("username") String username,
			@RequestParam("password") String pwd,
			@RequestParam("type") String type, Model model,HttpServletRequest request)
	{
		HttpSession session=request.getSession();  
		if(type.equals("member")){
			MemberVo member=loginService.memberLogin(username, pwd);
			if(member==null) 
				return "error";
			model.addAttribute("member",member);
			session.setAttribute("member", member);
			return "member";
		}
		else if(type.equals("hotel")){
			HotelManagerVo hotelManager=loginService.hotelLogin(username, pwd);
			if(hotelManager==null) 
				return "error";
			model.addAttribute("hotelManager",hotelManager);
			session.setAttribute("hotelManager", hotelManager);
			return "hotelmanage";
		}
		else if(type.equals("manager")){
			WebManagerVo manager=loginService.managerLogin(username, pwd);
			if(manager==null) 
				return "error";
			model.addAttribute("admin", manager);
			session.setAttribute("admin", manager);
			return "admin";
		}
		else if(type.equals("markter")){
			WebMarketerVo marketer=loginService.marketerLogin(username, pwd);
			if(marketer==null)
				return "error";
			model.addAttribute("marketer",marketer);
			session.setAttribute("marketer", marketer);
			return "market";
		}
		else return "error";		
	}
	@RequestMapping("/easyhotel/logOut")
	public String logout(@RequestParam("username") String username,@RequestParam("type") String type,HttpServletRequest request){
		HttpSession session=request.getSession();
		if(type.equals("member"))
		{
			session.removeAttribute("member");
		}
		else if(type.equals("hotel"))
		{
			session.removeAttribute("hotelManager");
		}
		else if(type.equals("manager"))
		{
			session.removeAttribute("admin");
		}
		else if(type.equals("markter"))
		{
			session.removeAttribute("marketer");
		}
		return "main";
	}
	
}
