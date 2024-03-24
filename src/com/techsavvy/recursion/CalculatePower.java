package com.techsavvy.recursion;

public class CalculatePower {

	public static void main(String[] args) {
		double res = calculatePower(2,-1);
		System.out.println("Result is: "+res);

	}

	private static double calculatePower(double num, double power) {
		if(power == 0) {
			return 1;
		}
		if(power > 0) {
			return num * calculatePower(num,power-1);
		} else 
			return 1/num * calculatePower(num,power+1);
		
	}

}
