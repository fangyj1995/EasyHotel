package com.nju.easyhotel.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	static String  pattern="yyyy-MM-dd";
	static SimpleDateFormat format = new SimpleDateFormat(pattern);
	public static String format(Date date){
		if(date==null) return null;
		return format.format(date);
	}
	public static String format(Date date,String pattern){
		if(date==null) return null;
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}
	public static Date format(String datestr){
		if(datestr==null) return null;
		try {
			return format.parse(datestr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static Date format(String datestr,String pattern){
		if(datestr==null) return null;
		try {
			SimpleDateFormat format = new SimpleDateFormat(pattern);
			return format.parse(datestr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}
}
