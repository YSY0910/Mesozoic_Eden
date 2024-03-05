package JavaAPI;

import java.util.*;

public class EX4{
	public static void main(String[]args) {
		listPropertiesExtra();
	}
	
	
	public static void listProperties() {
		List<String> list   = new ArrayList<>();
		list.add("J");
		list.add("A");
		list.add("V");
		list.add("A");
		// insertion order maintained, duplicate allowed
		System.out.println(list);    // [J, A, V, A]
		list.add(1, "0");
		list.add(3, "0");
		// precise control of where elements are inserted
		System.out.println(list);   // [J, 0, A, 0, V, A]
	}
	

	public static void listPropertiesExtra() {
		List<String> list  = new ArrayList<>();
		list.add("Joe"); list.add("Mary"); list.add("Cindy");
		System.out.println(list.contains("Mary"));    
		System.out.println(list.get(0));                     
		System.out.println(list.indexOf(2));                   
		System.out.println(list.indexOf("Joe"));          
		System.out.println(list.remove("Joe"));    
		System.out.println(list.remove("Kate")); 
		System.out.println(list);                                  
		list.remove(0); 
		System.out.println(list);                                        
		list.set(0, "Paul");
		System.out.println(list);                                 
	}
}