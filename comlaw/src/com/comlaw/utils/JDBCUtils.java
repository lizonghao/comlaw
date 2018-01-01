package com.comlaw.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.commons.configuration.Configuration;

/**
 * @filename : JdbcUtils.java
 * @description : 
 * 
 * @author : sf
 * @time : 2016年12月25日 下午10:45:19
 */

public class JDBCUtils {
	
	static Configuration config = ConfigUtils.getConfiguration();
	
//硬编码
//	private static String driver = "oracle.jdbc.OracleDriver";
//	private static String url = "jdbc:oracle:thin:@192.168.226.129:1521/orcl";
//	private static String user = "scott";
//	private static String password = "tiger";
	
//	private static String driver = "com.mysql.jdbc.Driver";
//	private static String url = "jdbc:mysql://127.0.0.1:3306/bookstore";
//	private static String user = "root";
//	private static String password = "root";
	
	private static String driver = config.getString("mysql.driver");
	private static String url = config.getString("mysql.url");
	private static String user = config.getString("mysql.username");
	private static String password = config.getString("mysql.password");

	static {
		try {
			Class.forName(driver);
			// DriverManager.registerDriver(driver)
		} catch (ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		}
	}

	// 获取连接
	public static Connection getConnection() {
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
//add语句关闭资源
	public static void closeAll(Connection conn, Statement st, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				st = null;
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}
	//针对没有返回结果集的增，删，改，关闭资源
	public static void closeAll(Connection conn, Statement st){
		if (st != null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				st = null;
			}
		}

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}
	}
}
