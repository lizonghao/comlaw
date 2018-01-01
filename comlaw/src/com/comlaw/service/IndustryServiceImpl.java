package com.comlaw.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.comlaw.bean.IndustryBean;
import com.comlaw.dao.IndustryDao;
import com.comlaw.utils.JDBCUtils;

/**
 * 
 *@file_name:IndustryServiceImpl.java
 *@description:
 *
 *@author:sf
 *@time:2017年12月31日 下午6:00:15
 *
 */

@Service("industryService")
@Transactional
public class IndustryServiceImpl implements IndustryService {
	
	@Autowired
	private IndustryDao industryDao;

	@Test
	public void saveIndustryBean() throws Exception {
		
		Connection conn= JDBCUtils.getConnection();
		PreparedStatement pst = null;
		String sql = "insert into industry(industry_name) values(?)";
			pst = conn.prepareStatement(sql);
		
		
		pst.setString(1, "internet");
	
		pst.executeUpdate();	
		JDBCUtils.closeAll(conn, pst);
	}

	
	@Override
	public void saveIndustryBean(IndustryBean industryBean) throws Exception {
		
		industryDao.saveIndustryBean(industryBean);
	}

	@Override
	public List<IndustryBean> queryList() throws Exception {
		
		return industryDao.queryList();
		
	}

	@Override
	public void updateIndustryBean(IndustryBean industryBean) throws Exception {
		
		industryDao.updateIndustryBean(industryBean);
		
	}
}
