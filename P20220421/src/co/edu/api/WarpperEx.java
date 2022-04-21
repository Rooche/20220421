package co.edu.api;

public class WarpperEx {
	public static void main(String[] args) {

		// 랩퍼클래스
		// 기본데이터를 참조데이터용으로.
		// 기본데이터타입에서 대문자를 대입하면 참조데이터로
		// int, long, byte, float(기본데이터) -> Integer, Long, Byte, Float
		int n1 = 100;
//		Integer n2 = 200; // n2는 클래스타입.
//		Integer n2 = new Integer(200); // 200; 랩퍼타입으로 바꿔주는걸 박싱이라고 부름
		Integer n2 = 200; // 200; 랩퍼타입으로 바꿔주는걸 박싱이라고 부름
		n1 = n2; // 언박싱.
		byte b1 = n2.byteValue(); // 200이라는 Integer값을 byte로.
		System.out.println(b1); // 200이라는 값을 byte로 바꿔버리니 -56으로 출력
		Float f1 = 12.3F;
		
		Integer.parseInt("100");
		Double.parseDouble("123.456");
	}

}
