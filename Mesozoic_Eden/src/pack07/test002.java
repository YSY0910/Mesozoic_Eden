package pack07;

import java.io.IOException;

class Dog{
	public void walk() {System.out.println("Dog::walk()");}
	public Dog run() {return new Dog();}
}
class Terrier extends Dog{
	//public String walk();{return "walk the Dog";} 1
	//private void walk(); 2
	//public void walk() throws IOEception{} 3
	public void walk(int meters) {} //4
	@Override public void walk() {System.out.println("Terrier::walk()");} //5
	//@Override public Dog run() {return new Dog();} 6
	//@Override public Terrier run() { return new Terrier();} 7
	@Override public Dog run() { return new Terrier();} //8
}

public class test002 {
	public static void main(String[]args) {
		Dog dt = new Terrier(); //9
		dt.walk(); //10
		
		Dog d = dt.run(); //11
		if(d instanceof Terrier) {
			System.out.println("Terrier object!");
		}
	}
}
