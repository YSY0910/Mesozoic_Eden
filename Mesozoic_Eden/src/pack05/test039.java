package pack05;

public class test039 {

	public static void m1(String... args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		for(String s:args) {
			System.out.println(s + " ");
		}
		System.out.println();
	}
	
	public static void m1(int n, String...args) {
		System.out.println(n);
		for(String s:args) {
			System.out.println(s);
		}
		System.out.println();
	}
//	public static void m1(String... args, int n) {}
//	public static void m1(String[] args) {}
	
	
	public static void main(String[] args) {
		m1();
		m1("A");
		m1("A","B");
		m1("A","B","C");
		m1(10, "A","B","C");
	}


}
