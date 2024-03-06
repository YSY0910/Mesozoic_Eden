package Collections_Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class T5 {

	public static void main(String[] args) {
		//SortTest
		List<Person> personList = new ArrayList<>();
		
		personList.add(new Person("가온bdwqfbf", 50));
		personList.add(new Person("다빈eewfg", 40));
		personList.add(new Person("나린fsdf", 60));
		
		for(Person person : personList) {
			System.out.println(person);
		}
		
		System.out.println();
		
		Collections.sort(personList);
		for(Person person : personList) {
			System.out.println(person);
		}
		
		System.out.println();
		/*
		Comparator<Person> nameCompara = new Comparator<Person>() {
			@Override public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName()); // 이름의 철자 순서로 정렬. a~z ㄱ~ㅎ
			}
		};*/
		
		Comparator<Person> nameLengthComparator = (p1, p2) ->
			Integer.compare(p1.getName().length(), p2.getName().length()); //이름의 길이 순서로 정렬
			
		Collections.sort(personList, nameLengthComparator);
		
		for(Person person : personList) {
			System.out.println(person);
		}
			System.out.println();
		//TreeSet Test
		Comparator<Person> nameCompara = (p1, p2) ->
			p1.getName().compareTo(p2.getName());
			
			TreeSet<Person> personTreeSetByName = new TreeSet<>(nameCompara);
			
			personTreeSetByName.add(new Person("Hopp", 1));
			personTreeSetByName.add(new Person("Joep", 4));
			personTreeSetByName.add(new Person("Anine", 3));

			System.out.println(personTreeSetByName);
			
	}

	
}
