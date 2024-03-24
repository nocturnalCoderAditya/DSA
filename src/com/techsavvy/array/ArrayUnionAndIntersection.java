package com.techsavvy.array;

import java.util.Arrays;

public class ArrayUnionAndIntersection {
	public static void main(String[] args) {
		int arr1[] = {2, 3, 5, 6}; 
		int arr2[] = { 1, 3, 4, 5, 7};
		findUnion(arr1,arr2);
		System.out.println("\n");
		findIntersection(arr1,arr2);
	}

	private static void findIntersection(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		
		if(m > n) {
			int [] temp = arr1;
			arr1=arr2;
			arr2=temp;
			
			int t = m;
			m=n;
			n=t;
		}
		
		Arrays.sort(arr1);
		
		for(int i=0; i<arr2.length;i++) {
			boolean bool = binarySearch(arr1, arr2[i], 0, arr1.length-1);
			if(bool) {
				System.out.print(arr2[i] + " ");
			}
		}
		
	}

	private static void findUnion(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		
		if(m > n) {
			int [] temp = arr1;
			arr1=arr2;
			arr2=temp;
			
			int t = m;
			m=n;
			n=t;
		}
		
		Arrays.sort(arr1);
		printArray(arr1);
		
		for(int i=0; i<arr2.length;i++) {
			boolean bool = binarySearch(arr1, arr2[i], 0, arr1.length-1);
			if(!bool) {
				System.out.print(arr2[i] + " ");
			}
		}
	}
	
	static boolean binarySearch(int[] arr, int num, int l , int r) {
		while(l<=r) {
			int m = (l+r)/2;
			int a = arr[m];
			if(num == a) {
				return true;
			}
			else if(a > num) {
				return binarySearch(arr, num, l, m-1);
			} else {
				return binarySearch(arr, num, m+1, r);
			}
		}
		return false;
	}
	
	static void printArray(int[] arr){
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
}
