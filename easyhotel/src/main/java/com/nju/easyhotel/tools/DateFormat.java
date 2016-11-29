package com.nju.easyhotel.tools;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	static String  pattern="yyyy-MM-dddd";
	public static String format(Date date ){
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}
	public static String format(Date date,String pattern){
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		return format.format(date);
	}
}
