package InterfacePractice;

sealed abstract class Vehicle permits Jeep, Heli{
	void travel() {System.out.println("Vehicle::Go to travel");}
	void start() 	{System.out.println("Vehicle::We are move");}
}

non-sealed class Jeep extends Vehicle{
	@Override public void travel()
	{System.out.println("Jeep::Go to travel");}
	@Override public void start()
	{System.out.println("Jeep::We are move");}
}
non-sealed class Heli extends Vehicle{
	@Override public void travel()
	{System.out.println("Helicopter::Go to travel");}
	@Override public void start()
	{System.out.println("Helicopter::We are move");}
}

public class P2{
	public static void main(String[]args) {
		Vehicle v = new Heli();
		v.travel();
		v.start();
	}
}