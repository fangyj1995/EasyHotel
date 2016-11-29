package com.nju.easyhotel.vo;

import java.util.Date;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.NotEmpty;

public class SearchForm {//搜索酒店时提及表单的Vo
	
	@NotEmpty(message="酒店名称不能为空")
	@NotNull(message="酒店名称不能为空")
	String name;

	@NotNull(message="入住日期不能为空")
	@Future(message="入住日期不得早于现在时间")
	Date startDate;
	
	@NotNull(message="退房日期不能为空")
	@Future(message="退房日期不得早于现在时间")
	Date endDate;
	
	String roomKind;
	
    
	@Min(value=1,message="房间数量不能小于1")
	int roomNum=1;

    String sortCondition;//"价格"或"星级"或"评分"或null
    

    public String getSortCondition() {
		return sortCondition;
	}
	public void setSortCondition(String sortCondition) {
		this.sortCondition = sortCondition;
	}
	

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getRoomKind() {
		return roomKind;
	}
	public void setRoomKind(String roomKind) {
		this.roomKind = roomKind;
	}
	public int getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}
    public String toString(){
	    return name+"; "+startDate+"; "+endDate+"; "+roomKind+"; "+roomNum;
    }
}
