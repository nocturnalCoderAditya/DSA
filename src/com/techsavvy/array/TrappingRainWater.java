package com.techsavvy.array;

public class TrappingRainWater {

	public static void main(String[] args) {
		int[] arr = {5,0,6,2,3};
	    System.out.println("Max water that can be trapped is: "+findMaxWaterTrapping(arr));

	}

	private static int findMaxWaterTrapping(int[] arr) {
		int n = arr.length;
		int res = 0;
		int[] lMax = new int[n];
		int[] rMax = new int[n];
		
		lMax[0] = arr[0];
		for(int i=1; i<n; i++) {
			lMax[i] = Math.max(arr[i], arr[i-1]);
		}
		
		rMax[n-1] = arr[n-1];
		for(int i=n-2; i>=0; i--) {
			rMax[i] = Math.max(arr[i], arr[i+1]);
		}
		
		for(int i=0; i<n; i++) {
			res = res + Math.min(lMax[i], rMax[i]) - arr[i];
		}

		return res;
	}

	

}
