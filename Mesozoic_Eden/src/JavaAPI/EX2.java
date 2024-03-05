package JavaAPI;

public class EX2 {
	
	public static void whatHappens(String s, StringBuilder sb) {
		s = s.concat("there!");
		sb.append("there!");
		System.out.println("whatHappens: " + s);
		System.out.println("whatHappens: " + sb);
	}
	
	public static void main(String[]args) {
		String s = "Hi";
		StringBuilder sb = new StringBuilder("Hi");
		whatHappens(s,sb);
		System.out.println("main: " + s);
		System.out.println("main: " + sb);
	}
	
}
