package com.nju.easyhotel.service;

import com.nju.easyhotel.vo.MemberVo;

public interface MemberService {

	 int signUp(MemberVo member);
	 int creditRecharge(String memberId,int credit);
	 int getCredit(String memberId);
	 MemberVo getMemberById(String memberId);
	 int modifyMember(MemberVo member);
}
