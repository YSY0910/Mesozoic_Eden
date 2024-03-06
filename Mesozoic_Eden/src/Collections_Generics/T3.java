package Collections_Generics;
import java.util.*;

public class T3 {

	public static void main(String[]args) {
		
		//HashTest
		Map<String, Integer> map = new HashMap<>();
		
		map.put("장미", 12);
		map.put("꽃", 8);
		map.put("송이", 10);
		int rossMap = map.get("장미");
		System.out.println(rossMap); // 12
		int rossMap1 = map.get("꽃");
		System.out.println(rossMap1); // 8
		System.out.println();
		map.put("꽃", 15);
		System.out.println(rossMap); // 12
		int rossMap2 = map.get("꽃");
		System.out.println(rossMap2); // 15
		System.out.println();
		for(Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue()); // 키와 값
		}
		System.out.println();
		for(String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key)); // 키와 값
		}
		System.out.println();
		for(Integer value : map.values()) {
			System.out.println(value); // 값만 출력 됨.
		}
		System.out.println();
		
		
		
	}
}
