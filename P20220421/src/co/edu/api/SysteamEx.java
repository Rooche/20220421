package co.edu.api;

public class SysteamEx {
	public static void main(String[] args) {
		System.out.println("start");
//		System.exit(0);
		System.out.println("end");

		long start = System.currentTimeMillis(); // 현재시간을 밀리세컨드 타입으로 표현해줌
		start = System.nanoTime();
		int sum = 0;
		for (int i = 0; i < 1000000; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		end = System.nanoTime();
		System.out.println(end-start);
	}
}
