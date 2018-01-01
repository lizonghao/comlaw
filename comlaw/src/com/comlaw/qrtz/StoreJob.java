package com.comlaw.qrtz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.stereotype.Component;

/**
 * @filename : StoreJob.java
 * @description:
 * 
 * @author : sf
 * @time:2017年9月13日 下午4:59:25
 */
@Component
public class StoreJob implements Job {
	

	@Override
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// 默认执行的是execute的内容
		System.out.println("0000000000000000000000");
		// TODO Auto-generated method stub

	}



}
