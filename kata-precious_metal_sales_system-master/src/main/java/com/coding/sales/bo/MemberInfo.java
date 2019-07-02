package com.coding.sales.bo;

/**
 * 会员信息
 * 
 * @author Administrator
 *
 */
public class MemberInfo {
	
	String name;		//姓名
	String level; 		//等级
	String cardNo;  	//卡号
	Integer integral;	//积分

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	@Override
	public String toString() {
		return "MemberInfo [name=" + name + ", level=" + level + ", cardNo="
				+ cardNo + ", integral=" + integral + "]";
	}

	
}
