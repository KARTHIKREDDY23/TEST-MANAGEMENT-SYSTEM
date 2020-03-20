package com.b4.testmanagement.service;

import com.b4.testmanagement.test.Test;

public interface TestService 
{
	public int deleteTest(int TestId);
	public Test getTestById(int TestId);
	public boolean checkAdmin(int userId);
	public Test assignTest(int testid);

}
