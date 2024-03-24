package com.techsavvy.string;

import java.util.Arrays;

public class AnagramSearch {
	static final int CHAR=256;
	
	public static void main(String[] args) {
		String str = "geeksforgeeks";
		String pat = "frog";
		boolean res = isAnagramPresentUsingSlidingWindow(str,pat);
		if(res) {
			System.out.println("Yes Anagram is present");
		} else {
			System.out.println("No Anagram is not present");
		} 

	}

	private static boolean isAnagramPresentUsingSlidingWindow(String str, String pat) {
		int[] pArr = new int[256];
		int[] sArr = new int[256];
		
		int m = pat.length();
		int n = str.length();
		
		for(int i=0; i<m;i++) {
			pArr[pat.charAt(i)]++;
			sArr[str.charAt(i)]++;
		}
		
		for(int i=m; i<n;i++) {
			if(Arrays.equals(pArr, sArr)) {
				return true;
			}
			sArr[str.charAt(i)]++;
			sArr[str.charAt(i-m)]--;
		}
		return false;
	}

}
