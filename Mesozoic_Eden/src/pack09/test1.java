package pack09;
/*
봉인된 클래스에 다가 갈 수 없음.
class Truck extends Vehicle{
	@Override public String toString() {
		return "Truck::toString";
	}
}
class Convertible extends Car{
	@Override public String toString() {
		return "Convertible::toString";
	}
}
*/

public class test1 {

	public static void main(String[]args) {
		Vehicle a = new Vehicle();
		Vehicle b = new Car();
		Vehicle c = new Saloon();
		Vehicle d = new Volvo();
		Vehicle e = new Ford();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
	}
}

sealed class Vehicle permits Car{
	public String toString(){
		return "Vehicle::toString";
	}
}
sealed class Car extends Vehicle permits Saloon{
	@Override public String toString(){
		return "Car::toString";
	}
	public String move() {
		return "I moved";
	}
}

sealed class Saloon extends Car permits Ford, Volvo{
	@Override public String toString(){
		return "Saloon::toString";
	}
	@Override public String move() {
		return "I already Move..";
	}

}

non-sealed class Volvo extends Saloon{
	@Override public String toString(){
		return "Volvo::toString";
	}
}

non-sealed class Ford extends Saloon{
	@Override public String toString(){
		return "Ford::toString";
	}
}


