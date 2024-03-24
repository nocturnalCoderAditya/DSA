package com.techsavvy.recursion;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n = 10;
		for(int i=0; i<n; i++) {
			System.err.print(fib(i) + " ");
		}
	}
	
	private static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
}
