package com.techsavvy.array;

public class SortSquareArray {

	public static void main(String[] args) {
		int[] arr = {8};
		int[] res = squareSorted(arr);
		for(int i=0; i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
	}

	private static int[] squareSorted(int[] arr) {
		int l = 0;
		int r = arr.length-1;
		int[] res = new int[arr.length];
		int i = arr.length-1;
		while(l<=r) {
			int leftSquare = arr[l] * arr[l];
			int rightSquare = arr[r] * arr[r];
			if(leftSquare > rightSquare) {
				res[i--] = leftSquare;
				l++;
			} else {
				res[i--] = rightSquare;
				r--;
			}
		}
		return res;
	}
}
