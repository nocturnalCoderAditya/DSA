package com.techsavvy.array;

import java.util.ArrayList;

public class SubArraySum {
	public static void main(String[] args) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int[] arr = {1,4,20,3,10,5};
		int sum = 37;
		res = subarraySum(arr, arr.length, sum);
		System.out.println("response is: "+res);

	}

	private static ArrayList<Integer> subarraySum(int[] arr, int n, int sum) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		int currSum = 0;
		int j=0;
		for(int i=0; i<arr.length;i++) {
			currSum = currSum+arr[i];
			while(currSum > sum) {
				currSum = currSum-arr[j];
				j++;
			}
			if(currSum == sum) {
				res.add(j);
				res.add(i);
				return res;
			}
		}
		res.add(-1);
		return res;
	}

}
