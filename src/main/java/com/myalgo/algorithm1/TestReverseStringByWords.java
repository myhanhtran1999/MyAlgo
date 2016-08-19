package com.myalgo.algorithm1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestReverseStringByWords {
	
	private ReverseStringByWords reverseString;
	
	@BeforeMethod
	public void init() {
		reverseString = new ReverseStringByWords();
	}
	
	@DataProvider(name="testdata")
	public Object[][] getTestData() {
		Object[][] objData = {
				{"This is first test data"}, {"This is the second test data"}, {"This is the thrid test data"}
		};
		return objData;
	}
	
	@Test(dataProvider="testdata")
	public void testReverseString(String str) {
		System.out.println("Before reverse: " + str);
		System.out.println("After reverse: " + reverseString.reverseByWord(str));
		System.out.println("================");
	}

	
}
