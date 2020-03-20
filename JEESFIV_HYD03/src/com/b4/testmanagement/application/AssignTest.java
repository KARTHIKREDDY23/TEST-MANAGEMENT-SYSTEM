package com.b4.testmanagement.application;

import java.util.Scanner; 
import com.b4.testmanagement.service.TestService;
import com.b4.testmanagement.service.TestServiceImpl;
import com.b4.testmanagement.test.Test;

public class AssignTest 
{
	public static void main(String[] args) 
	{
		TestService ser=new TestServiceImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user id: ");
		int userId =  sc.nextInt();		
		boolean res = ser.checkAdmin(userId);
		try
		{
			if(!res)
			{
				Test t =ser.assignTest(103);
				System.out.println(t.getTestid()+" "+t.getTestTitle()+" "+t.getTestDuration()+" "+t.getTestTotalMarks());
				System.out.println("Test has been Assigned For user "+userId);
			}
			else
				System.out.println("Invalid User");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}
		sc.close();
	}
}
