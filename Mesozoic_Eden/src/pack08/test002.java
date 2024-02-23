package pack08;


abstract class Pencil{
	abstract void write(); // no {}.
}
abstract class CharcoalPencil extends Pencil{}  // abstract를 입력하지 않고 두면 컴파일 에러.
abstract class WaterColorPencil extends Pencil{}
class GraphitePencil extends Pencil{
	@Override void write() {
		System.out.println("GraphitePencil::write()");
	}
}

public class test002 {
	public static void main(String[]args) {
		//Pencil pp = new Pencil(); // 추상 클래스라 인스터스 생성 불가능.
		Pencil ppp = new GraphitePencil();
		ppp.write();
	}
}
