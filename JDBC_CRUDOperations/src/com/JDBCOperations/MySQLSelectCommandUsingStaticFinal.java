package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLSelectCommandUsingStaticFinal {
	
	static final String DBURL = "jdbc:mysql://127.0.0.1:3306/wiprotable";
	static final String USER = "root";
	static final String PASSWORD = "Happyrich@123";
	static final String QUERY = "Select book_no,title,sub_code ,author from book_detl";
	
	public static void main(String[] args) throws SQLException {
	//Open connection
		try(Connection con = DriverManager.getConnection(DBURL,USER,PASSWORD);
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(QUERY);){
			while(rs.next()) {
				//Display Values
				System.out.println("Bno. " + rs.getString("book_no"));
				System.out.println("Title " + rs.getString("title"));
				System.out.println("Sub Code " + rs.getString("sub_code"));
				System.out.println("Authod " + rs.getString("author"));

			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}


	}

}
