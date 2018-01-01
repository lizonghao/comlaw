package com.comlaw.service;

import java.util.List;

import com.comlaw.bean.IndustryBean;

/**
 * 
 *@file_name:IndustryService.java
 *@description:
 *
 *@author:sf
 *@time:2017年12月31日 下午7:13:36
 *
 */
public interface IndustryService {
	
	public void saveIndustryBean(IndustryBean industryBean)throws Exception;
	
	public List<IndustryBean> queryList() throws Exception;
	
	public void updateIndustryBean(IndustryBean industryBean)throws Exception;
}
