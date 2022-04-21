package co.edu.api;

import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		String y = "2020";
		String m = "06 || 6"; // "06" 또는 6;
		
		showCal(y,m);
	}
	
	public static void showCal(String year, String month) {
		//달력출력
		
		
		Calendar my = Calendar.getInstance();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=======================");
	}
		
}
