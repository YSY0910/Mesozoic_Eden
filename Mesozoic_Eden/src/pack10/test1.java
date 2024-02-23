package pack10;

class Parent{
	{System.out.println("6. Parent instance init block 1");}
	static {System.out.println("2. Parent static init block 1");}
	Parent(){System.out.println("8. Parent constructor");}
	{System.out.println("7. Parent instance init blook 2");}
	static {System.out.println("3. Parent static init block 2");}
}
class Child extends Parent{
	{System.out.println("9. Child instance init block 1");}
	static {System.out.println("4. Child static init block 1");}
	Child(){System.out.println("11. Child constructor");}
	{System.out.println("10. Child static init block 2");}
	static {System.out.println("5. Child static init block 2\n");}
}

public class test1 {
	static {System.out.println("1. InitializationBlocks static init block");} //메인함수의 static이 가장 먼저 실행
	{System.out.println("InitializationBlocks instance init block");}
	//코드는 작성 되었으나, 인스턴스 초기화 블록으로 작성되었기 때문이다.
	//main 메소드 내에서 new Child()로 Child 클래스의 객체를 생성하고 있어, Parent 클래스의 인스턴스 초기화 블록은 실행되지만,
	//test1 클래스의 인스턴스 포기화 블록은 실행되지 않음.
	public static void main(String[]args) {
		System.out.println("--> Creating first Child object.");
		new Child();
		System.out.println("\n--> Creating second Child object..");
		new Child();
	}
}
