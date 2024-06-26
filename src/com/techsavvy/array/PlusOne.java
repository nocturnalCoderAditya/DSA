package com.techsavvy.array;

/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
 * The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 */

public class PlusOne {

	public static void main(String[] args) {
		int[] arr = {9,1,9};
		int[] res = plusOne(arr);
		for(int i : res) {
			System.out.print(i + " ");
		}

	}

	private static int[] plusOne(int[] digits) {
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        digits[i] = 0;
	    }
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    return newNumber;
	}
}
