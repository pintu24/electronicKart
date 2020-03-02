package com.ekart.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ekart.model.User;

public class ConnectingToDB 
{
	PreparedStatement preparedStatement;
	Connection connection;
	
	public void connection()
	{
		try 
		{
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "AJAY", "0998");
		}
		catch (SQLException e)
		{
			
			e.printStackTrace();
		}

	}
	public void getConnection(User user)
	{
		try {
			connection();
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
	
	public String testConnection(User user)
	{
		connection();
		try 
		{
			PreparedStatement preparedStatement=connection.prepareStatement("select * from ekartusers where username=?,password=?");
			preparedStatement.setString(1, user.getUserName());
			preparedStatement.setString(2, user.getPassword());
			ResultSet set=preparedStatement.executeQuery();
			
			if(set.next())
			{
				return "loginsuccess";
			}
			else
			{
				return "loginfailure";
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
		
	}
}
