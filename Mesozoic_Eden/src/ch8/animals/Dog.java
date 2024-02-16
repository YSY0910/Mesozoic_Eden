package ch8.animals;

public class Dog {
	private String dogName;
	protected int age;
	public Dog(String dogName) {this.dogName = dogName;}
	public String getDogName() {return dogName;}
	void pkgPrivate() {this.dogName = "Chairman";}
}

class Cat{	//package-private
	Cat(){}
	public void testDogAccess() {
		Dog d = new Dog("Rex");
		d.age = 2;
		d.pkgPrivate();
	
	}
	
}
