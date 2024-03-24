package com.techsavvy.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SubArraysWithProductLessThanTarget {

	public static void main(String[] args) {
		int[] arr = {2,5,3,10};
		int target = 30;
		List<ArrayList<Integer>> res = findSubArrays(arr, target);
		System.out.println(res);

	}

	private static ArrayList<ArrayList<Integer>> findSubArrays(int[] arr, int target) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		int l = 0;
		int product = 1;
		for(int r = 0; r<arr.length; r++) {
			product = product * arr[r];
			
			while(l<=arr.length && product >= target) {
				product = product/arr[l];
				l++;
			}
			List<Integer> tempList = new LinkedList<>();
		    for(int i=r; i>=l; i--){
		      tempList.add(0, arr[i]);
		      res.add(new ArrayList<>(tempList));
		    }
		}
		
		return res;
	}

}
