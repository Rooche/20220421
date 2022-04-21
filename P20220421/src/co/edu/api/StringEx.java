package co.edu.api;

import java.util.Scanner;

public class StringEx {
		public static void main(String[] args) {
			// 주민번호 => 생년월일, 남 또는 여 구분
			
			// 950405-2345678 =>95년생 4월 5일생, 여자입니다
			// 991001-1234567 => 99년생 10월 1일생, 남자입니다
			// 9704051234567 => 97년생 4월 5일생, 남자입니다
			// 0505053456789 => 05년 5월 5일 생, 남자입니다
		//	String result = checkInfo();
		//	System.out.println(result);
			
		}
		
		public static String checkInfo(String jumin) {
			Scanner sc = new Scanner(System.in);
			System.out.println("주민등록번호를 입력하세요");
			String num = sc.nextLine();
			
			String year = num.substring(0, 2);
			String month = num.substring(2, 4);
			String date = num.substring(4 ,6);
			String gender = num.substring(num.length()-7, num.length()-7);
		     if (gender == 1) {
		            gender = "남자";
		        } else {
		            gender = "여자";
		        }
			
			return "95년생 4월 5일생, 여자입니다." ;
		}
}
