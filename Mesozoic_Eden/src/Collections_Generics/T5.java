package Collections_Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

public class T5 {

	public static void main(String[] args) {
		//SortTest
		List<Person> personList = new ArrayList<>();
		
		personList.add(new Person("가온", 50));
		personList.add(new Person("다빈", 40));
		personList.add(new Person("나린", 60));
		
		for(Person person : personList) {
			System.out.println(person);
		}
		
		System.out.println();
		
		Collections.sort(personList);
		for(Person person : personList) {
			System.out.println(person);
		}
		
		System.out.println();
		
		Comparator<Person> nameCompara = new Comparator<Person>() {
			@Override public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		};
		Collections.sort(personList, nameCompara);
		for(Person person : personList) {
			System.out.println(person);
		}
	}

}
