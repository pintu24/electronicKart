package com.ekart.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ekart.model.User;

public class ConnectingToDB 
{
	public void getConnection(User user)
	{
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AJAY", "0998");
			PreparedStatement preparedStatement=connection.prepareStatement("insert into ekartusers values(?,?,?,?)");
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getEmail());
			preparedStatement.setString(3, user.getPassword());
			preparedStatement.setInt(4, user.getMobileNo());
			preparedStatement.executeQuery();
			connection.close();
		}
		
		catch(SQLException sqe)
		{
			sqe.printStackTrace();
		}
	}
}
