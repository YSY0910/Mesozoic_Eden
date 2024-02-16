package pack06;
// 인스턴스와 클래스 멤버

class Person{
	private String name;
	private static int count;
	
	Person(String name){
		//name = aName; 이거보단 this를 사용하는게 좋음
		this.name = name;
		Person.count++;
	}
	public String getName() {
		return name;
	}
	public void setName(String aName) {
		name = aName;
	}
	public static int getCount() {
		return Person.count;
	}
}


public class test041 {

	int x;
	public void m() {}
	
	
	public static void main(String[] args) {
		/*
		test041 pe = new test041();
		pe.x = 999;
		pe.m();
		System.out.println(pe.x);
		*/
		
		Person p1 = new Person("Maaike");
		Person p2 = new Person("Sean");
		Person p3 = new Person("Alice");
		System.out.println(Person.getCount());
		//static이 붙으면 인스턴스가 아닌 클래스 멤버에 속하게 됨.
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		System.out.println();
		
		p1.setName("Maaike van Puttern");
		p2.setName("Sean Kennedy");
		p3.setName("Alive Margets");
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		//System.out.println(p1.getCount());
		//System.out.println(p2.getCount());
		//p1과 p2는 서로 다른 객체로 취급되어 카운트가 1, 1로 나옴.
		//인스턴스 변수의 스코프는 클래스 자신이다. 
		
	}
	
}
