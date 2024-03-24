package com.techsavvy.string;

import java.util.HashMap;
import java.util.Map;

public class HighestWordFrequencyInString {

	public static void main(String[] args) {
		String str = "hello java read java and say hello to everyone and to god and to java teacher";
		String res = findHighestFreqWord(str);
		System.out.println("Highest repeating word is: "+res);

	}

	private static String findHighestFreqWord(String str) {
		HashMap<String, Integer> hm = new HashMap<>();
		String res = "";
		int max = Integer.MIN_VALUE;
		for(String s : str.split(" ")) {
			hm.put(s, hm.getOrDefault(s,0)+1);
		}
		System.out.println(hm);
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			int val = entry.getValue();
			if(val > max) {
				res = entry.getKey();
				max = val;
			}
		}
		return res;
	}
}
