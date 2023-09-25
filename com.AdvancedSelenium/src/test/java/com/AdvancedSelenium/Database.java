package com.AdvancedSelenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Database {

	public static void main(String[] args) throws SQLException {
		
		//Load or Register the driver
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		
		//Create the connection
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testyantra", "root", "root");
		
		//Create the statement
		Statement state = conn.createStatement();
		
		//Execute the query
		ResultSet set = state.executeQuery("select * from employees");
		
		//Print the Result 
		String name="";
		while (set.next()) {
			name = set.getString(1)+"\t"+set.getString(2)+"\t"+set.getString(3);
			//name = set.getString(1);
			System.out.println(name);
		}
		
		//Close the connection
		conn.close();
	}
}