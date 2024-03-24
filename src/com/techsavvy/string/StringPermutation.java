package com.techsavvy.string;

public class StringPermutation {

	public static void main(String[] args) {
		String str = "abcd";
		permutate(str, 0, str.length());

	}

	private static void permutate(String str, int l, int r) {
		if(l == r) {
			System.out.println(str);
		} else {
			for(int i=l;i<r;i++) {
				str = swap(str,l,i);
				permutate(str,l+1,r);
				str = swap(str,l,i);
			}
		}
	}

	private static String swap(String str, int i, int j) {
		char[] arr = str.toCharArray();
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return String.valueOf(arr);
	}

}
