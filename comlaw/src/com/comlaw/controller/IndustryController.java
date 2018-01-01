package com.comlaw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.comlaw.bean.IndustryBean;
import com.comlaw.service.IndustryService;

/**
 * 
 * @file_name:IndustryController.java
 * @description:
 *
 * @author:sf
 * @time:2017年12月31日 下午8:23:00
 *
 */
@Controller
public class IndustryController{

	@Autowired
	private IndustryService industryService;

	public void saveIndustryBean(IndustryBean industryBean) throws Exception {

		industryService.saveIndustryBean(industryBean);
	}

	@RequestMapping("queryIndustryList.do")
	public ModelAndView queryList() throws Exception {
		
		ModelAndView model = new ModelAndView();
		
		 List<IndustryBean> list =industryService.queryList();
		 for (IndustryBean industryBean : list) {
			System.out.println(list);
		}
		 model.addObject("list", list);
		 
		 model.setViewName("/test/industryList");
		 return model;
	}

	public void updateIndustryBean(IndustryBean industryBean) throws Exception {

		industryService.updateIndustryBean(industryBean);

	}

}

	
