package com.techsavvy.array;

public class ArrayRotationLeft {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int k = 2;
		int[] res = arrayRotationLeft(arr, k);
		for(int num : res) {
			System.out.print(num + " ");
		}
	}

	private static int[] arrayRotationLeft(int[] arr, int k) {
		int n = arr.length;
		arrayReverse(arr,0,n-1);
		arrayReverse(arr, 0, k);
		return arr;
	}
	
	static int[] arrayReverse(int[] arr, int l, int r) {
		while(l<=r) {
			int temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			l++;
			r--;
		}
		return arr;
	}
}
