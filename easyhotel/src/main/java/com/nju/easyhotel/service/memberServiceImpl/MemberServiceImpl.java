package com.nju.easyhotel.service.memberServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nju.easyhotel.dao.MemberDao;
import com.nju.easyhotel.service.MemberService;
import com.nju.easyhotel.vo.MemberVo;
@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	private MemberDao memberDao;
	@Override
	public int signUp(MemberVo member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int creditRecharge(String memberId, int credit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCredit(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVo getMemberById(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int modifyMember(MemberVo member) {
		// TODO Auto-generated method stub
		return 0;
	}

}
