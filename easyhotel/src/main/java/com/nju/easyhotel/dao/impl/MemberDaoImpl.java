package com.nju.easyhotel.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nju.easyhotel.dao.MemberDao;
import com.nju.easyhotel.po.MemberPo;
@Repository
public class MemberDaoImpl implements MemberDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int insertMember(MemberPo member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyMember(MemberPo member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberPo getMemberById(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberPo getMemberByName(String memberName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int check(String memberName, String pwd) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modifyMemberCredit(int memberId, int credit) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getMemberCredit(int memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
