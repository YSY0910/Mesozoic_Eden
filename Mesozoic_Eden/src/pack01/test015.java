package pack01;

public class test015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nLetters = 0;
		String name = "Alan";
		
		switch (name) {
		case "Jane", "Sean", "Alan", "Paul" -> nLetters = 4;
		case "Janet", "Susan" -> nLetters = 5;
		case "Maaike", "Alison", "Miriam" -> nLetters = 6;
		default -> {
			System.out.println("Unrecognized name: " + name);
			nLetters = -1;
			}
		}
		System.out.println(nLetters);
	}
}
