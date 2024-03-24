package com.techsavvy.array;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		int[] arr = {8,5,0,10,0,20};
		int[] res = moveZerosToEnd(arr);
		for(int i=0; i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
	}

	private static int[] moveZerosToEnd(int[] arr) {
		int idx = 0;
		for(int i=0; i<arr.length;i++) {
			if(arr[i] != 0) {
				swap(arr,idx,i);
				idx++;
			} 
		}
		return arr;
	}

	private static void swap(int[] arr, int idx, int i) {
		int temp = arr[i];
		arr[i] = arr[idx];
		arr[idx] = temp;
	}
}
