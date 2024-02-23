package pack08;


final class Earth{}
//class Moon extends Earth{} // final이라 확장 불가.

class Pen{
	final void write() {System.out.println("Signed::Pen");}
	//final abstract scribble(); //final write() 메서드가 정의되고, write()를 덮어 쓰려는 시도때문에 컴파일 에러가 난다.

}
class FountainPen extends Pen{
	public void write1() {System.out.println("Signed::FountainPen");}
	//@Override void write() {} //final은 덮어써지면 안된다는 것을 의미한다.
}


public class teat003 {
	final int ONE_YEAR = 1;
	void print(final String name, final int age) {
//		  age = age _ONE_YEAR;
//        references – ok to access the object
//        System.out.println(name.toUpperCase());
//        references – cannot modify the reference
//        name = “Alexander”;
	}
    public static void main(String[] args) {
    	Pen p = new Pen();
    	p.write();
    	
    }
}