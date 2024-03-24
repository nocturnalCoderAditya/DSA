package com.techsavvy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Demo {

	public static void main(String[] args) throws Exception {
		String[] date = {"20th Oct 2052", "27th Jun 1987", "1st Mar 1990"};
		List<String> input = Arrays.asList(date);
		//o/p : 1952-10-20
		List<String> res = preProcessDate(input);
		System.out.println(res);

	}

	private static List<String> preProcessDate(List<String> dates) throws ParseException {
		List<String> res = new ArrayList<>();
		for(int i=0; i<dates.size();i++) {
			String currDate = dates.get(i);
			String[] temp = currDate.split(" ");
			String day = parseDay(temp[0]);
			int month = parseMonth(temp[1]);
			month = month+1;
			String strMonth = month<=9 ? "0" + String.valueOf(month) : String.valueOf(month);
			String year = temp[2];
			String strDate = year + "-" +strMonth + "-" +day;
			res.add(strDate);
		}

		return res;
	}

	private static String parseDay(String str) {
		String day = "";
		int n = str.length();
		if(n == 3) {
			day = "0" + String.valueOf(str.charAt(0));
		} else {
			day = String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1));
		}
		return day;
	}

	static int parseMonth(String mon) throws ParseException {
		Date date = new SimpleDateFormat("MMM", Locale.ENGLISH).parse(mon);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int month = cal.get(Calendar.MONTH);
		return month;
	}

}
