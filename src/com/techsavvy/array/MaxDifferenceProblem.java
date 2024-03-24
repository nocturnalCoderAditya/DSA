package com.techsavvy.array;

public class MaxDifferenceProblem {
	/*
	 * Given an array arr[] of integers, find out the maximum difference between any
	 * two elements such that larger element appears after the smaller number. 
	 */

	public static void main(String[] args) {
		int[] arr = {2,3,10,6,4,8,1};
		int maxDiff = findMaxDiffEfficient(arr);
		System.out.println("Max Diff between two numbers is: "+maxDiff);
	}
	
	
	private static int findMaxDiffEfficient(int[] arr) {
		int max_diff = arr[1] - arr[0];
		int minval = arr[0];
		for(int i=1;i<arr.length;i++) {
			int diff = arr[i]-minval;
			max_diff = Math.max(max_diff, diff);
			minval = Math.min(minval, arr[i]);
		}
		return max_diff;
	}
}
