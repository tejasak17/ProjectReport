//page1...
package com.mini.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionTest1 {
	Connection connection = null;
	PreparedStatement preparedStatement=null;

	public Connection getConnection() throws SQLException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "Tejas@123");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}
}