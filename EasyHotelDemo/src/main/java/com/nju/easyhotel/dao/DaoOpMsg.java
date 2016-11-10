package com.nju.easyhotel.dao;

public class DaoOpMsg {
	int code;//1成功0失败
    String msg;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public DaoOpMsg(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}
    
}
