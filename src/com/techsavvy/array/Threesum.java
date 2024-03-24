package com.techsavvy.array;

import java.util.Arrays;

public class Threesum {

	public static void main(String[] args) {
		int[] arr = {12, 3, 4, 1, 6, 9}; 
		int n = arr.length;
		int tripletSum = 24;
		int[] res = findTriplet(arr,n, tripletSum);
		for(int i = 0; i<res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

	private static int[] findTriplet(int[] arr, int n, int tripletSum) {
		int[] res = new int[3];
		//arr = {1,3,4,6,9,12}
		Arrays.sort(arr);
		for(int i=0; i<n-1;i++) {
			int l = i+1;
			int r = n-1;
			while(l<=r) {
				int sum = arr[i]+arr[l]+arr[r];
				if(sum == tripletSum) {
					res[0] = arr[i];
					res[1] = arr[l];
					res[2] = arr[r];
					return res;
				} else if(sum < tripletSum) {
					l++;
				} else {
					r--;
				}
			}
		}
		return res;
	}

	
}
