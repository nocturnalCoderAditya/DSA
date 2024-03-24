package com.techsavvy.array;

import java.util.HashMap;

public class ZeroSubArraySum {

	public static void main(String[] args) {
		int[] arr = {15,-2,2,7,1,-8,9,11};
		int res = largestZeroSubArraySum(arr);
		System.out.println("Largest SubArraySum is: "+res);
	}

	private static int largestZeroSubArraySum(int[] arr) {
		int max_len = 0;
		int sum = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0; i<arr.length;i++) {
			sum = sum + arr[i];
			if(sum == 0) {
				max_len = i+1;
			}
			if(hm.containsKey(sum)) {
				int prev_idx = hm.get(sum);
				max_len = Math.max(max_len, i-prev_idx);
			} else {
				hm.put(sum, i);
			}
		}
		return max_len;
	}

	

}
