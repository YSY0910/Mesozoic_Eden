package pack07_01;

class Vehicle{
	double cost = 100.0;
	static int age = 1;
	public void move() {
		System.out.println("Vehicle::move()");

	}
	public static void sm() {
		System.out.println("Vehicle::sm()");
	}
}
class Car extends Vehicle{
	double cost = 20_000.0;
	static int age = 2;
	@Override public void move() {
		System.out.println("Car::move()");
	}
	public static void sm() {
		System.out.println("Car::sm()");
	}
}
public class test001 {

	public static void main(String[] args) {
		
		Vehicle v = new Car();
		System.out.println(v.cost);
		System.out.println(v.age);
		//The static field Vehicle.age should be accessed in a static way
		v.sm();
		//The static method sm() from the type Vehicle should be accessed in a static way
		Vehicle.sm(); //Vehicle::sm()
		v.move();

	}

}
