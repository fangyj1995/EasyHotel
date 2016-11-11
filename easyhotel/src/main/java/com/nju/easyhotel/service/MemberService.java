package com.nju.easyhotel.service;

import com.nju.easyhotel.vo.MemberVo;

public interface MemberService {

	 int signUp();
	 int creditRecharge();
	 int getCredit();
	 MemberVo memberInfo();
	 int modifyMemberInfo(MemberVo member);
}
