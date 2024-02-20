package pack07;

class Vehicle{
	public void move() {System.out.println("Vehicle::move");}
}

class Car extends Vehicle{
	@Override public void move() {System.out.println("Car::move()");}
	public void wheels() {System.out.println("Car::wheels()");}
}
class Boat extends Vehicle {
	@Override public void move() {System.out.println("Boat::move()");}
	public void floats() {System.out.println("Boat::floats()");}

}
class Saloon extends Vehicle{
	@Override public void move() {System.out.println("Saloon::move()");}
}
class Convertible extends Car{}


public class test001{
	
	public static void doAction(Vehicle v) {
		v.move();
	}
	
	public static void main(String[]args) {
		
		//오른쪽에서 왼쪽으로 성립하면 업캐스팅 아니면 다운캐스팅
		Vehicle v = new Car();	
		doAction(v);
		doAction(new Boat());
		doAction(new Saloon());
		doAction(new Convertible());
		
		/*
		v.move();// 1
		
		v = new Boat();
		v.move();// 2
//		v.floats();// 3
		
		v = new Saloon();// 4
		v.move();// 5
		
		v = new Convertible();// 6
		v.move();// 7
		
		Saloon s = (Saloon) new Vehicle();// 8
		s.move();
		//오류는 안나지만 사실상 오류에 해당함.
		*/
	}
}
/*
다형성 전개: 런타임 때, move()는 non-static, 다형적(polymorphic) 메서드이므로, 참조 v에 의해서 참조된 객체가 적용된다. 
위의 코드 1라인에서 v는 Car 객체를 참조하므로, Car 버전의 move()가 실행된다. 따라서 출력은 Car::move()이다. 
위의 코드 2라인에서 v는 Boat 객체를 참조하므로, Boat 버전의 move()가 실행된다. 따라서 출력은 Boat::move()이다. 
위의 코드 3라인에서 v는 Vehicle 타입이다. Vehicle은 floats() 메서드가 없다; Boat에만 있는 메서드이어서 컴파일러는 v.floats()에 대해서 불평한다. 
위의 코드 4라인에서 v는 Saloon 객체를 참조한다. Saloon “is-a” Vehicle이므로, 문제없다. 
위의 코드 5라인에서 다형적(polymorphic) 호출 v.move()는 Saloon 버전의 move()를 실행하고, 그 결과 Saloon::move()가 출력된다. 
위의 코드 6라인에서 Convertible 객체가 생성되고 v가 그것을 참조한다. Convertible “is-a” Car 그리고 Car “is-a” Vehicle, 따라서 Convertible “is-a” Vehicle이므로 이것은 아무 문제가 없다. 
위의 코드 7라인에서 다형적(polymorphic) 호출, v.move()가 이루어진다. 그러나 그 Convertible은 move()를 오버라이딩하지 않았으므로, 그것은 빈 클래스 바디를 갖는다. 
따라서 Convertible에 있는 메서드는 Car에서 상속받은 move()와 wheels() 그리고 Object에서 상속받은 toSting()같은 것이다. 
실행시 JVM이 Car에 있는 move()를 실행하고, Car::move()가 출력된다.
위의 코드 8라인은 다운캐스팅과 ClassCastException 에러를 보여준다.
Saloon s = (Saloon) new Vehicle();   // ClassCastException
먼저 캐스트(Saloon)가 없으면 컴파일러는 다음을 허용하지 않는다.
Saloon s = new Vehicle();   //Compiler error
이것은 컴파일러 에러이다. 모든 Vehicle이 Saloon 클래스가 아니기 때문이다; 어떤 것은 Boat이다.
비록 Boat 클래스가 없을지라도 이 라인은 컴파일 되지 못한다.
*/














