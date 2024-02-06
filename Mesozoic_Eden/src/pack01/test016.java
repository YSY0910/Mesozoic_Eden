package pack01;

public class test016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nLetters = 0;
		String name ="Susan";
		
		nLetters = switch(name) {
		case "Jane": case "Sean": case "Alan": case "Paul":
			System.out.println("There are 4 letter in: " + name);
			yield 4;
		case "Susan": case "Jully":
			System.out.println("There are 5 letter in: " + name);
			yield 5;
		case "Alison": case "Handers":
			System.out.println("There are 6 letter in: " + name);
			yield 6;
		default:
			System.out.println("unrecognized name: " + name);
			yield -1;
		};
		System.out.println(nLetters);
	}

}
