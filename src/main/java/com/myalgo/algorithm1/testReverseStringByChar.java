package com.myalgo.algorithm1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testReverseStringByChar {
	
	private ReverseStringByChar reverseString;
	
	@BeforeMethod
	public void init() {
		reverseString = new ReverseStringByChar();
	}
	
	@DataProvider(name="testdata")
	public Object[][] getTestData() {
		Object[][] objData = {
			{"This is first test data"}, {"This is second test data"}, {"This is third test data"}
		};
		return objData;
	}
	
	@Test(dataProvider="testdata")
	public void testReverseString(String str) {
		System.out.println("Before reverse: " + str);
		System.out.println("After reverse: " + reverseString.reverseStringByChar(str));
		System.out.println("====================");
	}

}
