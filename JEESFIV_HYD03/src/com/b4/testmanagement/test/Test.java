package com.b4.testmanagement.test;

public class Test 
{
	private int testid;
	private String testTitle;
	private String testDuration;
	private int testTotalMarks;
	@Override
	public String toString() {
		return "Test [testid=" + testid + ", testTitle=" + testTitle + ", testDuration=" + testDuration
				+ ", testTotalMarks=" + testTotalMarks + "]";
	}
	public Test(){}
	public Test(int testid, String testTitle, String testDuration, int testTotalMarks) {
		super();
		this.testid = testid;
		this.testTitle = testTitle;
		this.testDuration = testDuration;
		this.testTotalMarks = testTotalMarks;
	}
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public String getTestTitle() {
		return testTitle;
	}
	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}
	public String getTestDuration() {
		return testDuration;
	}
	public void setTestDuration(String testDuration) {
		this.testDuration = testDuration;
	}
	public int getTestTotalMarks() {
		return testTotalMarks;
	}
	public void setTestTotalMarks(int testTotalMarks) {
		this.testTotalMarks = testTotalMarks;
	}
}