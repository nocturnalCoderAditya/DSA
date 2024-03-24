package com.techsavvy.array;

import java.util.ArrayList;

public class FindPosOfZerosFlippedToMaximiseConsecutiveOnes {

	public static void main(String[] args) {
		int arr[] = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
		int k = 2;
		int res = longestConsecutiveOnes(arr, k);
		System.out.println("length of longest consecutive ones is: "+res);
	}

	private static int longestConsecutiveOnes(int[] arr, int k) {
		int j = -1;
		int res = 0;
		int count = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] == 0) {
				count++;
			}
			while(count > k) {
				j++;
				if(arr[j] == 0) {
					count--;
				}
			}
			int len = i-j;
			res = Math.max(len, res);
		}
		return res;
	}
}