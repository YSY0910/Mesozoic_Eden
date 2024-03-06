//package Collections_Generics;
//
//import java.util.*;
//
//class Person{
//	String name;
//	int yearOfWork;
//	
//	Person(String name, int yearOfWork){
//		this.name = name;
//		this.yearOfWork = yearOfWork;
//	}
//	//@Override 작업을 해줘야 출력시 제대로 된 객체 정보가 보임.
//	@Override public String toString() {
//		return "name: " + this.name + " " + "yearOfWork: " + this.yearOfWork;
//				}
//}
//
//public class T1{
//	
//	public static void main(String[]args) {
//		
//		List<String> studentNames = new ArrayList<>();
//		studentNames.add("이스마엘");
//		studentNames.add("파우스트");
//		studentNames.add("로쟈");
//		
//		for(String student : studentNames) {
//			System.out.println(student);
//		}
//		
//		System.out.println();
//		
//		List<Person> personNames = new ArrayList<>();
//		personNames.add(new Person("이스마엘", 5));
//		personNames.add(new Person("파우스트", 8));
//		personNames.add(new Person("로쟈", 9));
//		// Person에 대한 생성자가 없어서 오류가 발생함. 클래스 생성 필요.
//		
//		for(Person person : personNames) {
//			System.out.println(person);
//		}
//		
//		System.out.println();
//		
//		Set<String> emailAddresses = new HashSet<>();
//		emailAddresses.add("tjsdyd0604@gmail.com");
//		emailAddresses.add("tjsdyd0604@naver.com");
//		emailAddresses.add("Ishmael@LimbusCMP.com");
//		emailAddresses.add("Ishmael@LimbusCMP.com");
//	
//		for(String email : emailAddresses) {
//			System.out.println(email);
//		//Set는 중복 요소를 허용하지 않는 컬렉션
//		}
//
//	}
//}
