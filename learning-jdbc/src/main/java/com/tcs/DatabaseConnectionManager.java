package com.tcs;
import java.util.*;
import java.sql.*;

public class DatabaseConnectionManager {
	private final String url;
	private final Properties pro;
	
	public DatabaseConnectionManager(String host, String databaseName, 
			String usrnm,String psw) {
		this.url= "jdbc::mysql://"+host+"/"+databaseName;
		this.pro = new Properties ();
		this.pro.setProperty("user", usrnm);
		this.pro.setProperty("password", psw);
	}
	public Connection getCon() throws SQLException{
		return DriverManager.getConnection(this.url,this.pro);
	}
}
