package co.edu.api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class CalendarEx {
	public static void main(String[] args) {

		int year = 2020;
		int month = 5;

		Calendar today = Calendar.getInstance();
		today.set(2020, month - 1, 4);
		System.out.println("년도: " + today.get(Calendar.YEAR));
		System.out.println("월: " + today.get(Calendar.MONDAY));
		System.out.println("일: " + today.get(Calendar.DAY_OF_MONTH)); // DAY_OF_MONTH말고 DATE라고 해도 됨
		System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("마지막날: " + today.getActualMaximum(Calendar.DATE));

		//////////////////////////////////////////////////
		
		Date todate = new Date();
		todate = new Date("2021/05/05");
		todate.setYear(2022); // 1900년을 기준으로 1900 + 2022 = 3922으로 출력
		System.out.println(todate.toString());
		
		//날짜만 쓰고싶으면 LocalDate
		LocalDate ldate = LocalDate.of(2022, 10, 10);
		System.out.println(ldate.toString());
		
		//시간만 쓰고싶으면 LocalTime
		LocalTime ltime = LocalTime.of(10, 10, 10);
		System.out.println(ltime.toString());
		
		//날짜 시간 다 쓰고싶으면 LocalDateTime
		LocalDateTime ldt = LocalDateTime.now(); //now는 현재시간 기준
		ldt = LocalDateTime.of(2022, 10, 5, 10, 20, 30);
		
//		System.out.println(ldt.toString());
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yy-MM-dd hh:mm:ss");
		System.out.println(ldt.format(dtf));
	
					
		
		
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd mm:ss");
//		System.out.println(sdf.format(new Date()));
//
//		Date now = new Date("2022/05/03");
//		System.out.println(sdf.format(now));
//		
//		LocalDateTime ldt = LocalDateTime.now();
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//		System.out.println(ldt.format(dtf));
	}

}
