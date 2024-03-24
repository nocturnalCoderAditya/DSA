package com.techsavvy.string;

public class NumToString {

	public static void main(String[] args) {
		String s = "abc5be4";
		String res = numToStr(s);
		System.out.println(res);
	}
	static String numToStr(String s) {
	   
	    for(int i=0; i<s.length();i++){
	        String str = String.valueOf(s.charAt(i));
	        char ch = s.charAt(i);
	        if(Character.isDigit(ch)){
	            int num = Character.getNumericValue(ch);
	            StringBuffer sb = new StringBuffer();
	            for(int j=0; j<num;j++){
	                sb.append("1");
	            } 
	            s = s.replace(str, sb.toString());
	        }
	    }
	    return s;
	}
	

}
