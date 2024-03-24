package com.techsavvy.string;

import java.util.Stack;

public class CountZeroWithAsterix {
	/*
	 * if 101010 the output should be 0 as 1 will cancel all zeros
	 * 101 the output should be 1 as one zero cancelled by so left is 1
	 * but if * is thr then it would not get cancelled i.e. 111*000 o/p is 7
	 */

	public static void main(String[] args) {
		String str = "111*000";
		int res = findLengthUsingStack(str);
		System.out.println("lenght is: "+res);

	}

	private static int findLength(String str) {
		int finalCount = 0;
		int asterixCount = 0;
		String[] arr = str.split("\\*");
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == '*') {
				asterixCount++;
			}
		}
		for(int i=0; i<arr.length;i++) {
			int count = 0;
			String temp = arr[i];
			count = findCount(temp);
			finalCount = finalCount+count;
		}
		
		return finalCount+asterixCount;
	}
	
	static int findCount(String str) {
		int zeroCount = 0;
		int oneCount = 0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i) == '0') {
				zeroCount++;
			}
			if(str.charAt(i) == '1') {
				oneCount++;
			}
		}
		
		return Math.abs(oneCount-zeroCount); 
	}
	private static int findLengthUsingStack(String str) {
		Stack<Character> stack = new Stack<>();
		stack.push(str.charAt(0));
		for(int i=1; i<str.length();i++) {
			char charToPut = str.charAt(i);
			char top;
			switch(charToPut){
			case('1'):
				top = stack.peek();
			if(top == '1' || top == '*') {
				stack.push(charToPut);
			} else {
				stack.pop();
			}
			case('*'):
				stack.push(charToPut);
			case('0'):
				top = stack.peek();
			if(top == '0' || top == '*') {
				stack.push(charToPut);
			} else {
				stack.pop();
			}
			}
		}
		return stack.size();

	}

}
