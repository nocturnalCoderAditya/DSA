package com.techsavvy.array;

public class ArrayRotationRight {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int k = 2;
		int[] res = arrayRotationRight(arr, k);
		for(int i=0; i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
	}

	private static int[] arrayRotationRight(int[] arr, int k) {
		int n = arr.length-1;
		arrayReverse(arr, 0, n);
		arrayReverse(arr, 0, k-1);
		arrayReverse(arr, k, n);
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
