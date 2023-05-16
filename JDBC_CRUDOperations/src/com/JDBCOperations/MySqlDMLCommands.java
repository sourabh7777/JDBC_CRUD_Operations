package com.JDBCOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySqlDMLCommands {

	public static void main(String[] args) throws SQLException {
		//1.Create Connections
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wiprotable","root","Happyrich@123");
		
		//2.Create Statement/query
		Statement stamt = con.createStatement();
		String s = "insert into book_detl values('')";
		
		//3.Execute Statement/Query
		stamt.execute(s);
		
		//4.Close Connections
		con.close();
		System.out.println("Statement Executed : row inserted ");

	}

}
