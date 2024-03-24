package com.techsavvy.array;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int arr1[] = { 1, 3, 4, 5};
		int arr2[] = {2, 4, 6, 8};
		
		int[] res = mergeTwoArrays(arr1,arr2);
		for(int i=0; i<res.length;i++) {
			System.out.print(res[i] + " ");
		}
	}
	// TC : O(n+m)
	//SC : O(n+m)
	private static int[] mergeTwoArrays(int[] arr1, int[] arr2) {
		int m = arr1.length;
		int n = arr2.length;
		int[] res = new int[m+n];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i<m && j<n) {
			if(arr1[i] < arr2[j]) {
				res[k++] = arr1[i++];
			}else {
				res[k++] = arr2[j++];
			}
		}
		while(i<m) {
			res[k++] = arr1[i++];
		}
		while(j<n) {
			res[k++] = arr2[j++];
		}
		return res;
	}

}
