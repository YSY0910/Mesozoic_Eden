package pack11;
interface MoveableObject{}
interface Spherical{
	void doSphericalThings();
}
interface Bounceable extends MoveableObject, Spherical{
	void bounce();
}

class Volleyball implements Bounceable{
	@Override public void doSphericalThings() {
		System.out.println("Vollyball::Spherical Things");
	}
	@Override public void bounce() {
		System.out.println("Vollyball::Bounce");
	}
}

abstract class Beachball implements Bounceable{}
public class InterfaceInheritance {
	public static void main(String[]agrs) {
		
		Volleyball volleyball = new Volleyball();
		
		volleyball.doSphericalThings();
		volleyball.bounce();
		
		Volleyball moveable = new Volleyball();
		
		if(moveable instanceof MoveableObject) {
			System.out.println("It is a type of MoveableObject.");
		}
		if(volleyball instanceof MoveableObject) {
			System.out.println("It is a type of MoveableObject.");
		}
		
	}
}
