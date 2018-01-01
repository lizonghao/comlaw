package com.comlaw.bean;
/**
 *@file_name:Industry.java
 *@description:
 *
 *@author:sf
 *@time:2017年12月31日 下午5:54:40
 *
 */
public class IndustryBean {
	   //industry_id          int not null auto_increment comment '行业id',
	   //industry_name        varchar(20) comment '行业名称',

	private Integer industryId;
	private String industryName;
	
	public Integer getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	@Override
	public String toString() {
		return "IndustryBean [industryId=" + industryId + ", industryName=" + industryName + "]";
	}
	
	
	
}
