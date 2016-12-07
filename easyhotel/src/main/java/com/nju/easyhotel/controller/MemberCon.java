package com.nju.easyhotel.controller;
import org.springframework.beans.factory.annotation.Autowired;
//这个类处理会员注册，信用充值，查看信用值，查看及修改会员信息的请求
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nju.easyhotel.service.MemberService;
import com.nju.easyhotel.vo.MemberVo;

@Controller
public class MemberCon {

	@RequestMapping(value="easyhotel/member/signup",method = RequestMethod.GET)
	public String signUp(){
	   return "signUp";//注册
    }
	@RequestMapping(value="easyhotel/member/signupRequest",method = RequestMethod.POST)
	public String signUp(MemberVo member){
	   return "signUpSuccess";//注册
    }
	public String creditRecharge(){//充值
		return " ";		
	}
	public String getCredit(){//查看信用值
		return " ";
	}
	public String memberInfo(){//查看会员基本信息
		return "";
	}
	public String modifyMemberInfo(){//修改会员基本信息
		return "";
	}

}
