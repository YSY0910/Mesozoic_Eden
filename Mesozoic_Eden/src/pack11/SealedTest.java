package pack11;


sealed interface Driveable permits Vehicle{
	void drive();
}

sealed class Vehicle implements Driveable permits Car{
	private int wheelMode;
	Vehicle(int wheelMode){
		this.wheelMode = wheelMode;
	}
	public int getWheelMode() {
		return wheelMode;
	}
	public void setWheelMode(int wheelMode) {
		this.wheelMode = wheelMode;
	}
	@Override
	public void drive() {System.out.println("Vehicle::Drive");}
}

sealed class Car extends Vehicle permits Saloon{
	Car(int wheelMode){
		super(wheelMode);
	}
	@Override
	public void drive() {System.out.println("Car::Drive");}
}

non-sealed class Saloon extends Car{
	Saloon(int wheelMode){
		super(wheelMode);
	}
	@Override
	public void drive() {System.out.println("Saloon::Drive");}
}

class Volvo extends Saloon{
	Volvo(int wheelMode){
		super(wheelMode);
	}
	@Override
	public void drive() {System.out.println("Volvo:Drive");}
}
class Ford extends Saloon{
	Ford(int wheelMode){
		super(wheelMode);
	}
	@Override
	public void drive() {System.out.println("Ford::Drive");}
}

//class Window extends Vehicle{}
//class Chair extends Car{}
//class Table implements Driveable{}


public class SealedTest {
	Vehicle[] vehicles = new Vehicle[10];
	
	public static void main(String[]args) {
		
		Vehicle vehicle1 = new Vehicle(4);
		Vehicle vehicle2 = new Car(4);
		Vehicle vehicle3 = new Saloon(4);
		Vehicle vehicle4 = new Volvo(4);
		Vehicle vehicle5 = new Ford(4);
		Vehicle vehicle6 = new Vehicle(2);
		Vehicle vehicle7 = new Car(2);
		Vehicle vehicle8 = new Saloon(2);
		Vehicle vehicle9 = new Volvo(2);
		Vehicle vehicle10 = new Ford(2);

		SealedTest sealedTest = new SealedTest();
		sealedTest.vehicles[0] = vehicle1;
		sealedTest.vehicles[1] = vehicle2;
		sealedTest.vehicles[2] = vehicle3;
		sealedTest.vehicles[3] = vehicle4;
		sealedTest.vehicles[4] = vehicle5;
		sealedTest.vehicles[5] = vehicle6;
		sealedTest.vehicles[6] = vehicle7;
		sealedTest.vehicles[7] = vehicle8;
		sealedTest.vehicles[8] = vehicle9;
		sealedTest.vehicles[9] = vehicle10;
		
        for (int i = 0; i < sealedTest.vehicles.length; i++) {
        	Vehicle drives = sealedTest.vehicles[i];
        	System.out.println("WheelMode: " + sealedTest.vehicles[i].getWheelMode() + "륜 구동");
        	drives.drive();
        	System.out.println();
        }
		
		
	}

}
