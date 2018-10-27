package com.yutian.entity;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Hotel {

	
	private int id; //id主键
	private String lkName;// 旅客姓名 lk_name
	private String lkSex;// 旅客性别
	private String lkIdCode;// 旅客身份证号码
	private String lkAddress;// 旅客身份地址信息
	private String lgHName;// 旅馆名称
	private String lgHAddress;// 旅馆地址
	private String lgTelphone;// 旅馆电话
	private String lkNoroom;// 入住房号
	private Date lkLtime;// 入住时间
	private Date lkEtime;// 退房时间
	private Date lkCreatetime;// 记录创建时间

	//============Getter And Setter Method================


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLkName() {
		return lkName;
	}
	public void setLkName(String lkName) {
		this.lkName = lkName;
	}
	public String getLkSex() {
		return lkSex;
	}
	public void setLkSex(String lkSex) {
		this.lkSex = lkSex;
	}
	public String getLkIdCode() {
		return lkIdCode;
	}
	public void setLkIdCode(String lkIdCode) {
		this.lkIdCode = lkIdCode;
	}
	public String getLkAddress() {
		return lkAddress;
	}
	public void setLkAddress(String lkAddress) {
		this.lkAddress = lkAddress;
	}
	public String getLgHName() {
		return lgHName;
	}
	public void setLgHName(String lgHName) {
		this.lgHName = lgHName;
	}
	public String getLgHAddress() {
		return lgHAddress;
	}
	public void setLgHAddress(String lgHAddress) {
		this.lgHAddress = lgHAddress;
	}
	public String getLgTelphone() {
		return lgTelphone;
	}
	public void setLgTelphone(String lgTelphone) {
		this.lgTelphone = lgTelphone;
	}
	public String getLkNoroom() {
		return lkNoroom;
	}
	public void setLkNoroom(String lkNoroom) {
		this.lkNoroom = lkNoroom;
	}
	public Date getLkLtime() {
		return lkLtime;
	}
	public void setLkLtime(Date lkLtime) {
		this.lkLtime = lkLtime;
	}
	public Date getLkEtime() {
		return lkEtime;
	}
	public void setLkEtime(Date lkEtime) {
		this.lkEtime = lkEtime;
	}
	public Date getLkCreatetime() {
		return lkCreatetime;
	}
	public void setLkCreatetime(Date lkCreatetime) {
		this.lkCreatetime = lkCreatetime;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
				.append("id:"+getId())
				.append("lkName:",getLkName())
				.append("lkIdCode",getLkIdCode())
				.append("lkLtime:",getLkLtime())
				.append("lkEtime:",getLkEtime())
				.append("lkNoroom:",getLkNoroom())
				.append("lgHName:",getLgHName())
				.append("lkCreatetime:",getLkCreatetime())
				.toString();
	}
	
}
