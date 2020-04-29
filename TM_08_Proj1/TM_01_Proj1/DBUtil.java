package com.wipro.sales.util;

import java.sql.*;

public class DBUtil
{
	public static Connection getDBConnection() throws Exception
	{
		Connection conn=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1531:XE","HR","HR");
		return conn;
	}

	/*
	//To Check the above function
	public static void main(String[] args) throws Exception
	{
		Connection conn=getDBConnection();
		if(conn!=null)
			System.out.println("True");
		else
			System.out.println("False");
	}
	*/
}
