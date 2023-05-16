package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlSelectCommand {

	public static void main(String[] args) throws SQLException {
		//1.Create Connections
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wiprotable","root","Happyrich@123");
				
				//2.Create Statement/query
				Statement stamt = con.createStatement();
				String s = "Select book_no,title,sub_code,author from book_detl";
				
				//3.Execute Statement/Query 4.Store Data in result set
				ResultSet rs = stamt.executeQuery(s);
				
				while(rs.next()) {
					String bid = rs.getString("book_no");
					String tit = rs.getString("title");
					String scode = rs.getString("scode");
					String aut = rs.getString("author");

					System.out.println(bid + " "+tit + " " + scode + " "+ aut);
				}
				
				//5.Close Connections
				con.close();
				System.out.println("Statement Executed :Query Retrived ........");

	}

}
