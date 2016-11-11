package com.nju.easyhotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nju.easyhotel.service.LoginService;

//这个类处理登录的请求
@Controller
public class LoginCon {

	@Autowired
	private LoginService loginService;
	@RequestMapping("/login")
	public String login(String username,String pwd){
		if(loginService.login(username, pwd)==1)
		return " ";	
		else return " ";
	}
	
}
