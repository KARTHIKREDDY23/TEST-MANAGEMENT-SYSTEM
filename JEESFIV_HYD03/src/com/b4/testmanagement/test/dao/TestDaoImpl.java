package com.b4.testmanagement.test.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.b4.testmanagement.test.Test;
import com.b4.testmanagement.utils.TestDBQueries;

public class TestDaoImpl implements TestDao 
{
	private Connection connection=null;
	private PreparedStatement pst;
	private ResultSet result;
	@Override
	public void openConnection()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			connection = DriverManager.getConnection(url,"karthik","karthik1");
		}
		catch(ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public void close()
	{
		try{
			connection.close();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	@Override
	public int deleteTest(int testid)
	{
		openConnection();
		int rows=0;
		try
		{
			pst=connection.prepareStatement(TestDBQueries.deleteEmplQuery);
			pst.setInt(1,testid);
			rows=pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		close();
		return rows;
	}
	@Override
	public Test getTestById(int testid)
	{
		openConnection();
		Test emp=null;
		try{
			pst=connection.prepareStatement(TestDBQueries.getTestById);
			pst.setInt(1, testid);


			result = pst.executeQuery();
			if(result.next())
			{
				emp = new Test();
				emp.setTestid(result.getInt(1));
				emp.setTestTitle(result.getString(2));
				emp.setTestDuration(result.getString(3));
				emp.setTestTotalMarks(result.getInt(4));

			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		close();
		return emp;
	}
	@Override
	public Test assignTest(int testid) 
	{
		Test t=null;
		Scanner sc = new Scanner(System.in);
		openConnection();
		try{
			pst=connection.prepareStatement(TestDBQueries.getTestById);
			pst.setInt(1, testid);
			result=pst.executeQuery();
			System.out.println("Test details:");
			if(result.next())
			{

				t= new Test();
				t.setTestid(result.getInt(1));
				t.setTestTitle(result.getString(2));
				t.setTestDuration(result.getString(3));
				t.setTestTotalMarks(result.getInt(4));
				System.out.println("Press enter to start the test: ");
				sc.nextLine();
				sc.close();
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		close();
		return t;
	}
	@Override
	public boolean checkAdmin(int userId) 
	{	
		openConnection();

		try{
			pst=connection.prepareStatement("select * from users where userid =?");
			pst.setInt(1,userId);
			result=pst.executeQuery();


			return result.next();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		close();
		return false;
	}
}