package pack11_1;

interface Moveable{
	//default void m();
	default void move() {
		System.out.println("Moving.");
	}
}

class Cheetah implements Moveable{
	@Override public void move() {
		System.out.println("Moving very fast!");
	}
}
	
class Elephant implements Moveable{}

class Eagle implements Moveable{
	@Override public void move() {
		System.out.println("I'm Move & I can Fly!");
		}
}
public class TestAnimal {
	public static void main(String[]args) {
		//Moveable m1 = new Moveable();
		Moveable cheetach = new Cheetah();
		cheetach.move();
		Moveable elephant = new Elephant();
		elephant.move();
		Moveable eagle = new Eagle();
		eagle.move();
	}
}
