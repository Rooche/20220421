package co.edu.api;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar2 {
	public static void main(String[] args) {
		String y = "2020";
		String m = "06 || 6"; // "06" 또는 6;

		showCal(y, m);
	}

	public static void showCal(String year, String month) {
		// 달력출력
		Scanner sc = new Scanner(System.in);

		System.out.println("년도를 입력하세요");
		int y = sc.nextInt();
		System.out.println("월을 입력하세요");
		int m = sc.nextInt();

		// 희망 연도, 월, 일 셋팅
		// 월의 범위는 0~11 이기 때문에 실제월 -1
		// 일은 달력이 1일부터 시작하기 때문에 1일로 셋팅
		// 요일 구하기(월의 첫날)
		Calendar my = Calendar.getInstance();
		my.set(y, m - 1, m);
		my.set(Calendar.YEAR, y);
		my.set(Calendar.MONTH, m);

		System.out.println("     " +  y + "년" + m + "월" + "     ");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("=======================");
		int lastOfDate = my.getActualMaximum(Calendar.DATE); // 달의 마지막 날짜
		int week = my.get(Calendar.DAY_OF_WEEK);

		for (int i = 1; i < week; i++) {
			System.out.print(" ");
		}
		for (int i = 1; i <= lastOfDate; i++) {
			System.out.print((i < 10) ? " " + i : " " + i);
			if (week % 7 == 0)
				System.out.println();
			week++;
			
		}
		System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-");
	}

}