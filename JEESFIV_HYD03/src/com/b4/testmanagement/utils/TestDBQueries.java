package com.b4.testmanagement.utils;
public class TestDBQueries 
{
	public static String deleteEmplQuery="delete from test where TestId=?";
	public static String getTestById = "select * from test where TestId=?";
	public static String getDisplayQuestions = "select * from Questions";
}

