package com.nju.easyhotel.dao.impl;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.nju.easyhotel.Application;
import com.nju.easyhotel.dao.MemberDao;
import com.nju.easyhotel.po.MemberPo;
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class MemberDaoImplTest {

	private MemberPo member1;
	private MemberPo member2;
	@Autowired
	MemberDao memberDao;
	@Before
	public void setUp() throws Exception {
		member1=new MemberPo("","user2","李四","1234","18423941233","1","1995-09-24",null,0,"1");
		member2=new MemberPo("1","user1","zhangsan","1234","18423942222","1","1995-09-24",null,0,"1");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInsertMember() {
		int i=memberDao.insertMember(member1);
		if(i==1)
			System.out.println("插入成功");
		else System.out.println("插入失败");
	}

	@Test
	public void testModifyMember() {
		int i=memberDao.modifyMember(member2);
		if(i==1)
			System.out.println("修改成功");
		else System.out.println("修改失败");
	}

	@Test
	public void testGetMemberById() {
		MemberPo member=memberDao.getMemberById("1");
		System.out.println(member);
	}

	@Test
	public void testModifyMemberCredit() {
		int credit=memberDao.modifyMemberCredit("1",100);
		System.out.println(credit);
	}

	@Test
	public void testGetMemberCredit() {
		int credit=memberDao.getMemberCredit("1");
		System.out.println(credit);
	}

}
