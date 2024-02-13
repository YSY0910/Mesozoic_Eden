package pack05;

public class test035 {

	public static void simpleExample() {
		System.out.println("Executing simpleExample() method...");
	}
	
	public static void Hello() {
		System.out.println("Hi, My name is Hello method... :)");
	}
	
	public static void main(String[] args) {
		
		System.out.println("main: before call to simpleExample()");
		simpleExample();  //메서드가 호출되 System.out.println("Executing simpleExample() method…"); 동작 및 출력...
		System.out.println("main: after call to simpleExample()");
		Hello();
	}

}
