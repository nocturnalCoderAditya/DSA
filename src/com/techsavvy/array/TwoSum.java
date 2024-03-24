package com.techsavvy.array;

public class TwoSum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6};
		int targetSum = 6;
		int[] res = findSumIndex(arr, targetSum);
		for(int num : res) {
			System.out.print(num + " ");
		}

	}

	private static int[] findSumIndex(int[] arr, int targetSum) {
		int[] res = new int[2];
		int l = 0;
		int r = arr.length-1;
		while(l<=r) {
			int sum = arr[l] + arr[r];
			if(sum == targetSum) {
				res[0] = l;
				res[1] = r;
				return res;
			} else if(sum > targetSum) {
				r--;
			} else {
				l++;
			}
		}
		return res;
	}

}
