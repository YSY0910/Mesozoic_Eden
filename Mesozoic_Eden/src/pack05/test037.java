package pack05;

public class test037 {

	public static int performCalc(int x, int y, String operation) {
		int result = switch(operation) {
		case "+" -> x + y;
		case "-" -> x - y;
		case "*" -> x * y;
		case "/" -> x / y;
		case "%" -> x % y;
		default -> {
			System.out.println("Unknown operation: " + operation);
			yield -1;
			}
		};
		return result;
	}
	
	
	
	
	
	public static void main(String[] args) {
		int result = performCalc(10, 2, "+");
		System.out.println(result);
		System.out.println(performCalc(10, 2, "-"));
		System.out.println(performCalc(10, 2, "*"));
		System.out.println(performCalc(10, 2, "/"));
		System.out.println(performCalc(10, 2, "%"));
		System.out.println();
		System.out.println(performCalc(10, 2, "&"));
	}

	  public static void someMethod(){}
	  public static void someMethod(int x){}
	  public static void someMethod(double x){}
	  public static void someMethod(String x){}
	  public static void someMethod(double x, int y){}
	  public static void someMethod(int x, double y){}
//	  public static void someMethod(int a, double b){}
	  public static int someMehtod(int x, double b){ return 0;}
}
