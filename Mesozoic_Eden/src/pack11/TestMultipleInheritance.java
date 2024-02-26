package pack11;

interface A{
	default void foo() {System.out.println("A:foo");}
}
interface B{
	default void foo() {System.out.println("B:foo\n");}
}

public class TestMultipleInheritance implements A, B{
	@Override
	public void foo() {
		System.out.println("TestMultipleInheritance::foo");
		A.super.foo();
		//A.foo(); A.foo() 구문은 인터페이스 A에서 정적(static) 메서드를 찾지만 그것은 non-static이다.
		B.super.foo();
	}
	
		public static void main(String[]args) {
			//A.super.foo(); 컴파일 에러, foo() 정적 메서드라 super 불가...
			new TestMultipleInheritance().foo();
		}
	
}
