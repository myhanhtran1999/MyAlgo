package com.myalgo.algorithm1;

public class ReverseStringByWords {
	
	public String reverseByWord(String str) {
		// Split string to String[] of words
		String[] words = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int index = words.length - 1; index >= 0; index --) {
			sb.append(words[index]).append(" ");
		}
		return sb.toString();
	}

}
