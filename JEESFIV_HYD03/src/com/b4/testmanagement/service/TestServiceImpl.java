package com.b4.testmanagement.service;

import com.b4.testmanagement.test.Test;
import com.b4.testmanagement.test.dao.TestDao;
import com.b4.testmanagement.test.dao.TestDaoImpl;

public  class TestServiceImpl implements TestService
{
	TestDao dao=new TestDaoImpl();
	@Override
	public int deleteTest(int TestId) 
	{
		int rows=dao.deleteTest(TestId);
		return rows;
	}
	@Override
	public Test getTestById(int TestId) {

		return dao.getTestById(TestId);
	}
	@Override
	public Test assignTest(int testid) {
		return dao.assignTest(testid);
	}
	@Override
	public boolean checkAdmin(int userId) {

		return dao.checkAdmin(userId);
	}
}


