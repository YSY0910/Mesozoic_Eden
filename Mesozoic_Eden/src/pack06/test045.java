package pack06;

class Dog{}
class Cat{}

public class test045 {
	
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		if(dog instanceof Dog) { // 참
			System.out.println("dog referring to a Dog object.");
		}
		if(cat instanceof Cat) { // 참
			System.out.println("cat referring to a Cat object.");
		}
//		if(cat instanceof Dog) { // Cat와 Dog 완전 다른 클래스이다. 거짓
//			System.out.println("cat referring to a Dog object");
//		}
	}

}
