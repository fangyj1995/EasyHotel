package com.nju.easyhotel.dao;

import com.nju.easyhotel.po.MemberPo;

public interface MemberDao {

	 int insertMember(MemberPo member);
	 int modifyMember(MemberPo member);
	 
	 MemberPo getMemberById(String memberId);
	 MemberPo getMemberByName(String memberName);//根据用户名查询
	 
	 int check(String memberName,String pwd);//验证用户名密码是否匹配
	 int modifyMemberCredit(String memberId,int credit);
	 int getMemberCredit(String memberId);	 
}
