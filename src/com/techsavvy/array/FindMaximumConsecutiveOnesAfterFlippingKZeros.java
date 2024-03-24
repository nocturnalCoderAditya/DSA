package com.techsavvy.array;

import java.util.ArrayList;

public class FindMaximumConsecutiveOnesAfterFlippingKZeros {

	public static void main(String[] args) {
		int arr[] = { 1 , 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
		int k = 2;
		ArrayList<Integer> res = maximizeOnesByFlippingZero(arr, k);
		System.out.println("Position of Zeros to be flipped to get max consecutive ones: "+ res);
	}

	private static ArrayList<Integer> maximizeOnesByFlippingZero(int[] arr, int k) {
		int j = -1;
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				count++;
				list.add(i);
			}
			while(count > k) {
				if(arr[++j] == 0) {
					count--;
					list.remove(0);
				}
			}
		}
		return list;
	}
}
