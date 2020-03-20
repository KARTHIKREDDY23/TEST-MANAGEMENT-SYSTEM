package com.b4.testmanagement.junit;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.b4.testmanagement.test.dao.TestDaoImpl;

public class TestCase 
{
	TestDaoImpl test = null;
	@Before
	public void setUp()
	{
		test = new TestDaoImpl();
	}
	@After
	public void tearDown()
	{
		test = null;
	}
	@Test
	public void test()
	{
		TestDaoImpl dao = new TestDaoImpl();
		int rows = dao.deleteTest(103);
		assertEquals(rows, 1);
	}	
	@Test
	public void testNegativeDeleteTest ()
	{
		TestDaoImpl dao = new TestDaoImpl();
		int rows = dao.deleteTest(105);
		assertNotEquals(rows, 1);
	}
	@Test
	public void testDeleteTest1 ()
	{
		TestDaoImpl dao = new TestDaoImpl();
		int rows = dao.deleteTest(102);
		assertEquals(rows, 1);
	}
	@Test
	public void testNegativeDeleteTest1 ()
	{
		TestDaoImpl dao = new TestDaoImpl();
		int rows = dao.deleteTest(109);
		assertNotEquals(rows, 1);
	}
}
