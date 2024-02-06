package pack01;

public class test014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nLetters = 0;
		String name = "Jane";
		
		nLetters = switch(name) {
		case "Jane", "Sean", "Alan", "Paul" -> {
			System.out.println("There are 4 letters in: " + name);
			yield 4;
		}
		case "Susan", "Jully", "Adama", "Janet" -> {
			System.out.println("There are 5 letters in: " + name);
			yield 5;
		}
		case "Maaike", "Alison", "Miriam" -> {
			System.out.println("There are 6 letters in: " + name);
			yield 6;
		}
		default -> {
			System.out.println("Unrecognized name: " + name);
			yield -1;
		}	
	};
		System.out.print("Have a " + nLetters + " nLetters");
	}
}
