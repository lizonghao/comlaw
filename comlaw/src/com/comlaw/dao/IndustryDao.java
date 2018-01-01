package com.comlaw.dao;

import java.util.List;

import com.comlaw.bean.IndustryBean;

/**
 * 
 *@file_name:IndustryDao.java
 *@description:
 *
 *@author:sf
 *@time:2017年12月31日 下午6:26:42
 *
 */
public interface IndustryDao {
	
	public void saveIndustryBean(IndustryBean industryBean)throws Exception;
	
	public List<IndustryBean> queryList() throws Exception;
	
	public void updateIndustryBean(IndustryBean industryBean)throws Exception;

}
