package Collections_Generics;

//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//import java.util.Queue;
//import java.util.Set;

import java.util.*;

public class T2 {

	public static void main(String[]args) {
		
		Map<String, String> userInfo = new HashMap<>();
		
		userInfo.put("이스", "이스마엘");
		userInfo.put("로쟈", "로지티온");
		userInfo.put("파우", "파우스트");
		
		Set<String> keys = userInfo.keySet(); // UserInfo를 출력하기 위한 밑작업. Set 사용
		
		for(String key : keys) {
			System.out.println("first name: " + key + " FullNames: " + userInfo.get(key));
		}
		
		System.out.println(); // 마무리
		
		Queue<String> printQueue = new LinkedList<>();
		
		printQueue.add("Document1");
		printQueue.add("Document2");
		printQueue.add("Document3");

		for(String docu : printQueue) {
			System.out.println(docu);
		}
		
		System.out.println(); 
		
		String nextJob = printQueue.poll();

		System.out.println(nextJob);

		System.out.println(); 
		
		List<String> names = new ArrayList<>();
		
		names.add("Julie");
		names.add(0, "Janice"); // 재니를 0번째 인덱스에 추가함.
		String name = names.get(0); // 변수에 입력
		System.out.println(name); //출력함
		names.set(1, "Monica");
		String name1 = names.get(1);
		System.out.println(name1);
		//names.remove(1);
		//names.remove("Janice");
		System.out.println(names.get(0));
		System.out.println();
		for(int i = 0; i < names.size(); i++) {
			System.out.println(names.get(i));
		}
		for(String name2 : names) {
			System.out.print(name2 + " ");
		}
		
		System.out.println(); 
		System.out.println(); 
		
		Set<String> names3 = new HashSet<>();
		
		names3.add("엘리자베스");
		names3.add("자네트");
		for(String name3 : names3) {
			System.out.println(name3);
		}
		names3.remove("자네트");
		for(String name3 : names3) {
			System.out.println(name3);
		}
		
		System.out.println(); 
		
		Set<String> names4 = new LinkedHashSet<>();
		
		names4.add("엘리자베스");
		names4.add("자네트");
		for(String name4 : names4) {
			System.out.println(name4);
		}
		
		System.out.println(); 
		
		Set<String> names5 = new  TreeSet<>();
		
		names5.add("엘리자베스");
		names5.add("자네트");
		for(String name5 : names5) {
			System.out.println(name5);
		}
		
	}
}

