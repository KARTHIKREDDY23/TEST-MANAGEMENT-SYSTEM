package com.b4.testmanagement.test.dao;

import com.b4.testmanagement.test.Test;

public interface TestDao 
{
	public void openConnection();
	public void close();		
	public int deleteTest(int testid);
	public Test getTestById(int testid);
	public Test assignTest(int testid);
	public boolean checkAdmin(int userId);
}
