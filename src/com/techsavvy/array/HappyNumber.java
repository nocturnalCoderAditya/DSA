package com.techsavvy.array;

public class HappyNumber {

	public static void main(String[] args) {
		int num = 23;
		if(isHappyNumber(num)) {
			System.out.println("Given number is a happy number");
		} else {
			System.out.println("Given number is not a happy number");
		}

	}

	private static boolean isHappyNumber(int num) {
		int digit = num%10;
		int squareNum = digit*digit;
		return false;
	}

}
