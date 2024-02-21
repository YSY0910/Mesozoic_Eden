package pack08;

class Vehicle{
}
class Boat extends Vehicle{
}
class Train extends Vehicle{
}
class Car extends Vehicle{
	private int numDoors;
	Car(int numDoors){
		this.numDoors = numDoors;
	}
	public int getNumDoors() {return numDoors;}
	public String onRoad() {return "I can drive with " + numDoors + " people";}
}
class Tuatara extends Vehicle{
	public String onRoad() {return "I'm SSC TUATARA. I am Hypercar and I can going to 460km/h..";}
}

public class test001 {
	public static void patternMatchingSwitch(Vehicle v) { // v는 Vehicle의 객체
		System.out.println(
		switch(v){
			case Boat b -> "It's a Boat";
			case Train t -> "It's a Train";
			case Car c when c.getNumDoors() == 4 -> "I'm Saloon, " + c.onRoad();
			case Car c when c.getNumDoors() == 2 -> "I'm Convertible, " + c.onRoad();
			case Tuatara s -> s.onRoad();
			case null, default -> "Invaild type";
		}
				);
	}
	
	public static void main(String[]args) {
		Vehicle a = new Boat();
		patternMatchingSwitch(a);
		Vehicle b = new Train();
		patternMatchingSwitch(b);
		Vehicle c = new Car(4);
		patternMatchingSwitch(c);
		Vehicle d = new Car(2);
		patternMatchingSwitch(d);
		Vehicle e = new Tuatara();
		patternMatchingSwitch(e);
	}
}
