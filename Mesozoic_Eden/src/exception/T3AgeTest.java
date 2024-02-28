package exception;

public class T3AgeTest {
	public static void main(String[]args) {
		T3Age t3Age = new T3Age(35);
		
		try {
            t3Age.setAge(10);  // Corrected the method invocation, and it should be on an instance of T3Age
            System.out.println("Age set successfully.");
        } catch (T3AgeException e) {
            System.out.println(e.getMessage());
        }
	}
}
