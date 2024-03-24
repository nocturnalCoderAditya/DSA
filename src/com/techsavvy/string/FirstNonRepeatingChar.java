package com.techsavvy.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		String str = "aabbcc";
		char c = firstNonRepeatingUsingMap(str);
		System.out.println("First non repeating character is: "+c);

	}

	private static char firstNonRepeating(String str) {
		int[] arr = new int[256];
		int minIdx = Integer.MAX_VALUE;
		for(int i=0; i<str.length(); i++) {
			if(arr[str.charAt(i)] == 0) {
				arr[str.charAt(i)] = i;
			} else {
				arr[str.charAt(i)] = -1;
			}
		}
		for(int i=0; i<arr.length;i++) {
			if(arr[i] > 0) {
				minIdx = Math.min(minIdx, arr[i]);
			}
		}
		if(minIdx == Integer.MAX_VALUE) {
			return 0;
		}
		return str.charAt(minIdx);
	}
	
	private static char firstNonRepeat(String str) {
		for(int i=0; i<str.length();i++) {
			if(str.indexOf(str.charAt(i), str.indexOf(str.charAt(i))+1) == -1) {
				return str.charAt(i);
			}
		}
		return 0;
	}
	
	private static char firstNonRepeatingUsingMap(String str) {
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for(char c : str.toCharArray()) {
			hm.put(c, hm.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry: hm.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return 0;
	}

}
