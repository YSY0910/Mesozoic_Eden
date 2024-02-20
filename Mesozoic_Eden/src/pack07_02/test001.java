package pack07_02;

class Animal{
	public void eat() {}
}

class Cow extends Animal {
	public void eat() {}
	public void eat(String s) {}
}

class Milk extends Cow{
	public void white() {}
	public void white(int i) {}
}

public class test001 {
	public void calc(int x, double y) {}
	public void calc() {}
	public void calc(int x) {}
	public void calc(double y) {}
	public void calc(double y, int x) {}
	//public void calc(int a, double b) {}
	//public int calc(int a, double b) {return 1;}
	//오버로딩 할 때는 시그니쳐가 중복되면 안됨.
	
	public static void main(String[]args) {
		Animal aa = new Animal();
		aa.eat();
		
		Animal ac = new Cow();
		ac.eat();
		//ac.eat("Grass");
		// 컴파일 오류 이유 : 새로 만들어진 Cow 객체는 Animal 클래스를 참조 받아 만들어짐, 대신 문자열을 받는 생성자는 Animal에게 없음.
		
		Cow cc = new Cow();
		cc.eat();
		cc.eat("Grass");
		
		Milk cd = new Milk();
		cd.white();
		cd.white(10);
	}

}
