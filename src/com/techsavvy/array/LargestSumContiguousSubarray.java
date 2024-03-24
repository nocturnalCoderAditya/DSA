package com.techsavvy.array;

public class LargestSumContiguousSubarray {

	//This is also called Kadane's Algorithm
	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int res = maxSubArraySum(arr);
		System.out.println("Maximum contiguous sum is: "+ res);
	}

	private static int maxSubArraySum(int[] arr) {
		int max_sum = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<arr.length;i++) {
			sum = sum+arr[i];
			if(max_sum < sum) {
				max_sum = sum;
			}
			if(sum < 0) {
				sum = 0;
			}
		}
		return max_sum;
	}
}

