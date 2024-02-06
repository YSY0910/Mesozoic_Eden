package pack01;

public class test013 {
	public static void main(String[]args) {
		
		int nLetters = 0;
		
		String name = "Susan";
		
		switch(name) {
		case "Jane": case "Sean": case "Alan": case "Paul":
			nLetters = 4;
			break;
		case "Janet": case "Susan": case "Jully":
			nLetters = 5;
			break;
		case "Michop": case "Alsion": case "Wiliam":
			nLetters = 6;
			break;
		case "YunSunYong":
			nLetters = 10;
			break;
		default:
			System.out.println("Unrecognized name: " + name);
			nLetters = -1;
			break;
			
		}
		System.out.println("nLetters is " + nLetters + ", " + name);
	}
}
