package com.comlaw.test;

import org.apache.commons.configuration.Configuration;
import org.junit.Test;

import com.comlaw.utils.ConfigUtils;

/**
 * 
 * @filename:TestConfigUtils.java
 * @description:
 *
 * @author: sf
 * @time: 2016年12月28日 下午9:44:47
 * @version: 1.0.0
 */
public class TestConfigUtils {
	@Test
	public void testConfigUtils(){
		
		Configuration config = ConfigUtils.getConfiguration();
		
		System.out.println(config.getString("mysql.driver"));
		System.out.println(config.getString("mysql.url"));
		System.out.println(config.getString("mysql.username"));
		System.out.println(config.getString("mysql.password"));
	}

}
