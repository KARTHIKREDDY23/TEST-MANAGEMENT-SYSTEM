package com.b4.testmanagement.application;

import com.b4.testmanagement.service.TestService;
import com.b4.testmanagement.service.TestServiceImpl;

public class DeleteTest
{
	public static void main(String[] args) {

		TestService service=new TestServiceImpl();
		int rows=service.deleteTest(103);
		if(rows>0)
			System.out.println("deleted");
		else
			System.out.println("not deleted");
	}
}
