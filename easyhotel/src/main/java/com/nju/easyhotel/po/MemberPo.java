package com.nju.easyhotel.po;

public class MemberPo {

	private String id;
	private String account;
	private String name;
	private String password;
	private String contact;
	private String type;
	private String birthday;
	private String enterprise;
	private int credit;
	private String level;
	public MemberPo() {
		super();
	}
	public MemberPo(String id, String account, String name, String password, String contact, String type,
			String birthday, String enterprise, int credit, String level) {
		super();
		this.id = id;
		this.account = account;
		this.name = name;
		this.password = password;
		this.contact = contact;
		this.type = type;
		this.birthday = birthday;
		this.enterprise = enterprise;
		this.credit = credit;
		this.level = level;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getEnterprise() {
		return enterprise;
	}
	public void setEnterprise(String enterprise) {
		this.enterprise = enterprise;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
}
