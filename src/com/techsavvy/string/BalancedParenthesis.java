package com.techsavvy.string;

import java.util.Stack;

public class BalancedParenthesis {
	public static void main(String[] args) {
		String str = "{[()]}}";
		if(isBalanced(str)) {
			System.out.println("Its balanced");
		} else {
			System.out.println("Its not balanced");
		}
	}

	private static boolean isBalanced(String str) {
		Stack<Character> s = new Stack<>();
		for(int i=0; i<str.length();i++) {
			char c = str.charAt(i);
			if(c == '[' || c == '{' || c == '(') {
				s.push(c);
				continue;
			}
			if(s.isEmpty()) {
				return false;
			}
			char check;
			switch(c) {
			case(')'):
				check = s.pop();
			if(check == '{' || check == '[') {
				return false;
				}
			break;
			case(']'):
				check = s.pop();
			if(check == '{' || check == '(') {
				return false;
				}
			break;
			case('}'):
				check = s.pop();
			if(check == '(' || check == '[') {
				return false;
				}
			break;
			}
		}
		return s.isEmpty();
	}
}
