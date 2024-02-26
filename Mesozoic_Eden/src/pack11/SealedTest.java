package pack11;


sealed interface Driveable permits Vehicle{
	void drive();
}

sealed class Vehicle implements Driveable permits Car{
	@Override
	public void drive() {System.out.println("Vehicle::Drive");}
}

sealed class Car extends Vehicle permits Saloon{
	@Override
	public void drive() {System.out.println("Car::Drive");}
}

non-sealed class Saloon extends Car{
	@Override
	public void drive() {System.out.println("Saloon::Drive");}
}

class Volvo extends Saloon{
	@Override
	public void drive() {System.out.println("Volvo:Drive");}
}
class Ford extends Saloon{
	@Override
	public void drive() {System.out.println("Ford::Drive");}
}

//class Window extends Vehicle{}
//class Chair extends Car{}
//class Table implements Driveable{}


public class SealedTest {
	public static void main(String[]args) {
		
	}

}
