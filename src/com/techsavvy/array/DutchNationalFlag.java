package com.techsavvy.array;

public class DutchNationalFlag {

	public static void main(String[] args) {
		int[] arr = {1,0,2,1,0};
		int[] res = dutchFlag(arr);
		for(int num : res) {
			System.out.print(num + " ");
		}
	}

	private static int[] dutchFlag(int[] arr) {
		int n = arr.length;
		int l = 0;
		int r = n-1;
		/*
		 * loop should not run till arr.length, It should be only until r, 
		 * as we have already processed the last element and decreased r by 1
		 */
		for(int i=0; i<r;) { 
			if(arr[i] == 0) {
				swap(arr,i++,l++);
			} else if(arr[i] == 1) {
				i++;
			} else {
				swap(arr,i,r--);
			}
		} 
		return arr;
	}

	private static void swap(int[] arr, int l, int r) {
		int t = arr[l];
		arr[l] = arr[r];
		arr[r] = t;
	}

}
