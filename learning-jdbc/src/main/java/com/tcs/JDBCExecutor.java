package com.tcs;
import java.sql.*;

public class JDBCExecutor {
	//private static final String FUN ="SELECT Count(*) FROM PRODUCTS";
	private static final String FUN ="select * from products;";
	public static void main(String[] args) {
		DatabaseConnectionManager dcm = new DatabaseConnectionManager("localhost:3306",
		"shop","root","domino62");
		System.out.println("Hola");
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = dcm.getCon();
			Statement stm = con.createStatement();
			ResultSet rst = stm.executeQuery(FUN);
			while(rst.next()) {
				System.out.println(rst.getInt(1));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}
