package Collections_Generics;

import java.util.*;

class Person implements Comparable<Person>{
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return this.name;
	}
	
	//@Override 작업을 해줘야 출력시 제대로 된 객체 정보가 보임.
	@Override public String toString() {
		return "이름: " + this.name + " " + "나이: " + this.age;
				} // 이름, 나이를 출력함.
	@Override public int compareTo(Person other) {
		return Integer.compare(this.age, other.age);
	}	// 위에 출력한 정보를 나이가 적은 순서로 다시 배치하여 출력하게 함.
}

public class T1{
	
	public static void main(String[]args) {
		
		List<String> studentNames = new ArrayList<>();
		studentNames.add("이스마엘");
		studentNames.add("파우스트");
		studentNames.add("로쟈");
		
		for(String student : studentNames) {
			System.out.println(student);
		}
		
		System.out.println();
		
		List<Person> personNames = new ArrayList<>();
		personNames.add(new Person("이스마엘", 5));
		personNames.add(new Person("파우스트", 8));
		personNames.add(new Person("로쟈", 9));
		// Person에 대한 생성자가 없어서 오류가 발생함. 클래스 생성 필요.
		
		for(Person person : personNames) {
			System.out.println(person);
		}
		
		System.out.println();
		
		Set<String> emailAddresses = new HashSet<>();
		emailAddresses.add("tjsdyd0604@gmail.com");
		emailAddresses.add("tjsdyd0604@naver.com");
		emailAddresses.add("Ishmael@LimbusCMP.com");
		emailAddresses.add("Ishmael@LimbusCMP.com");
	
		for(String email : emailAddresses) {
			System.out.println(email);
		//'Set'은 중복 요소를 허용하지 않는 컬렉션
		}

	}
}
