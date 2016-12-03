package com.nju.easyhotel.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nju.easyhotel.dao.MemberDao;
import com.nju.easyhotel.po.MemberPo;
@Repository
public class MemberDaoImpl implements MemberDao{
	@Autowired
    private JdbcTemplate jdbcTemplate;
	@Override
	public int insertMember(MemberPo member) {
		String sql="insert into member (account,name,password,contact,type,birthday,enterprise,credit,level_key) "
				+ "values ("
				+"'"+member.getAccount()+"',"
				+"'"+member.getName()+"',"
				+"password('"+member.getPassword()+"'),"
				+"'"+member.getContact()+"',"
				+"'"+member.getType()+"',"
				+"'"+member.getBirthday()+"',"
				+"'"+member.getEnterprise()+"',"
				+"'"+member.getCredit()+"',"
				+"'"+member.getLevel()+"'"
				+ ")";
		try{
		 int count=jdbcTemplate.update(sql);	
		 return count;	
		}
		catch(DataAccessException  e){
			return 0;
		}
	
	}

	@Override
	public int modifyMember(MemberPo member) {
		String sql="update  member set "
				+"account='"+member.getAccount()+"',"
				+"name='"+member.getName()+"',"
				+"password=password('"+member.getPassword()+"'),"
				+"contact='"+member.getContact()+"',"
				+"type='"+member.getType()+"',"
				+"birthday='"+member.getBirthday()+"',"
				+"enterprise='"+member.getEnterprise()+"'"
				+" where id="+member.getId();
		int count=jdbcTemplate.update(sql);	
		return count;
	}

	@Override
	public MemberPo getMemberById(String memberId) {
		String sql="select member.*,member_level.name as level from member left join member_level on level_key=member_level.id where member.id="+memberId;		
		try{
			   MemberPo member=jdbcTemplate.queryForObject(sql, new MemberRowMapper());
			   return member;
			}
			catch(IncorrectResultSizeDataAccessException  e){
				return null;
		}
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
		String sql="update member set credit = "+credit+" where id ="+memberId;
		int count=jdbcTemplate.update(sql);	
		return count;
	}

	@Override
	public int getMemberCredit(int memberId) {
		String sql ="select credit from member where id=" +memberId;
		int credit=jdbcTemplate.queryForObject(sql, Integer.class);
		return credit;
	}
	private static final class MemberRowMapper implements RowMapper<MemberPo>{
		@Override
		public MemberPo mapRow(ResultSet rs, int rowNum) throws SQLException {			
			return new MemberPo(
					rs.getString("id"),
					rs.getString("account"),
					rs.getString("name"),
					rs.getString("password"),
					rs.getString("contact"),
					rs.getString("type"),
					rs.getString("birthday"),
					rs.getString("enterprise"),
					rs.getInt("credit"),
					rs.getString("level")
					);
		}		
	}
}
