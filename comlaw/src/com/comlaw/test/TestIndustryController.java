package com.comlaw.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.comlaw.bean.IndustryBean;
import com.comlaw.controller.IndustryController;

/**
 *@file_name:TestIndustryController.java
 *@description:
 *
 *@author:sf
 *@time:2018年1月1日 上午9:57:39
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class TestIndustryController {
	
	@Autowired
	private IndustryController industryController;
	
	@Test
	public void addIndustryBean() throws Exception{
		IndustryBean i = new IndustryBean ();
		i.setIndustryName("python");
		industryController.saveIndustryBean(i);
		
	}
	@Test
	public void updateIndustryBean() throws Exception{
		IndustryBean i = new IndustryBean ();
		i.setIndustryId(2);
		i.setIndustryName("python");
		industryController.updateIndustryBean(i);;
		
	}
	

}
