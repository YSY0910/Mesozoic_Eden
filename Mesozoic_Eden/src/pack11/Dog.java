package pack11;

interface I1 {
	public abstract void m1();
    void m2();      // public abstract by default
    private void m3(){};
    //protected void m4();     // 컴파일러 에러
}
interface I2{
	public static final int VALUE1 = 1;
	int VALUE2 = 2; //public static final as well
}
interface Moveable{
	String HOW = "walk"; // String 앞에 public static final이 자동으로 붙음.
	void move(); // 앞에 아무것도 없어서 package private가 붙음.
}


public class Dog implements Moveable{
	//MUST be public - cannot assign weaker privileges..
	//void move() {}
	@Override
	public void move() {// MUST be public
		System.out.println("Dog::move()");
	}
	public static void main(String[]args) {
		//HOW = "walk"; // final은 변경 불가.
		System.out.println(Moveable.HOW);
		System.out.println(HOW);
		// cannot refer to an instance member from a static context
		
		// move();
		
		new Dog().move(); //Dog::move();
	}
}