package dinosaur;

public class test3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dinoSize = "XL";
		
		switch(dinoSize) {
		case "XS", "S":
			System.out.println("Small Herbivore Enclosure");
			break;
		case "M":
			System.out.println("Medium Herbivore Enclosure");
			break;
		case "L":
			System.out.println("Large Herbivore Emnclosure");
			break;
		case "XL":
			System.out.println("Extra Large Herbivore Emnclosure");
			break;
		default:
			System.out.println("Wrong Type.");
			break;		
		}
	}
}
