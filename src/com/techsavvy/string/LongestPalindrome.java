package com.techsavvy.string;

public class LongestPalindrome {

	public static void main(String[] args) {
		String str = "madamracecarmalayalam";
		String res = findLongestPalindrome(str);
		System.out.println("Longest Palindrome is: "+res);

	}

	private static String findLongestPalindrome(String str) {
		String longestPalindrome = str.substring(0,1);
		int n = str.length();
		for(int i=0; i<n;i++) {
			if(n%2 == 0) {
				String palindrome = intermediatePalindrome(str,i,i+1);
				if(palindrome.length() > longestPalindrome.length()) {
					longestPalindrome = palindrome;
				}
			}
			if(n%2 != 0) {
				String palindrome = intermediatePalindrome(str,i,i);
				if(palindrome.length() > longestPalindrome.length()) {
					longestPalindrome = palindrome;
				}
			}
		}
		return longestPalindrome;
	}

	private static String intermediatePalindrome(String str, int left, int right) {
		while(left>=0 && right < str.length() && str.charAt(right) == str.charAt(left)) {
			left--;
			right++;
		}
		return str.substring(left+1, right);
	}

}
