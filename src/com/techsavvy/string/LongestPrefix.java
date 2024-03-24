package com.techsavvy.string;

import java.util.Arrays;

public class LongestPrefix {

	public static void main(String[] args) {
		String[] arr = {"flower", "flow", "floor", "float"};
		String res = findLongestPrefix(arr);
		System.out.println("Longest Prefix is: "+res);
	}

	private static String findLongestPrefix(String[] arr) {
		String res = "";
		if(arr.length == 1) {
			return arr[0];
		}
		Arrays.sort(arr);
		int minIdx = Math.min(arr[0].length(), arr[arr.length-1].length());
		for(int i=0; i<minIdx;i++) {
			if(arr[0].charAt(i) == arr[arr.length-1].charAt(i)) {
				res = res + arr[0].charAt(i);
			}
		}
		return res;
	}
}
