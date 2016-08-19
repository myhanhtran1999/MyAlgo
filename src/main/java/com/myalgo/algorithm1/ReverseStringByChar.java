package com.myalgo.algorithm1;

public class ReverseStringByChar {
	
	public String reverseStringByChar(String str) {
		
		// Convert string to char[]
		char[] chArray = str.toCharArray();
		int left = 0;
		int right = chArray.length - 1;
		while (left < right) {
			char temp = chArray[right];
			chArray[right--] = chArray[left];
			chArray[left++] = temp;
		}
		return String.valueOf(chArray);
	}

}
