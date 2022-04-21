package co.edu.api;

import java.util.HashSet;

class Member {
	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//hashCode는 비교할 대상이 많으면 그룹을 지어서 hashCode값이 큰 범위로 구분
	// ex) 50만개가 있으면 hashCode => 100, 200, 300 ... / 13만개 13만개 14만개
	// 같은 데이터는 모으고 많은 데이터를 적절한 값을 줘서 구분을 준다
	@Override
	public int hashCode() {
//		return super.hashCode();
//		return 100;
		return this.age;
	}

	//
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(member.name);
		}
	//	Member member = (Member) obj;
		
//		return super.equals(obj);
//		return true;
		return false;
	}

	@Override
	public String toString() {
		return "이름은: " + name + ", 나이는: " + age + "입니다.";
	}
	
}

public class ObjectEx {
	public static void main(String[] args) {

		// ArrayList : 인덱스 요소를 구분. => 중복된 저장
		// Set (집합) : 요소값으로 구분 => 중복된 값 X
		// 
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(200);
		System.out.println(set.size()); // 중복값을 제외 => 3

		HashSet<Member> members = new HashSet<Member>();
		members.add(new Member("홍길동", 20));
		members.add(new Member("김길동", 22));
		members.add(new Member("홍길동", 20));
		System.out.println(members.size());

		System.out.println(new Member("홍길동", 20).toString());
	}
}
