package pack07_03;
import pack07.Book;

class FictionBook extends Book{
	public void doThings() {
		read(); //a
		this.read(); // 상속 받은걸 부름 //1
		
		FictionBook fb = new FictionBook();
		fb.read(); //2
		
		Book b = new Book(); //3
		//b.read(); //4
	}
}
class SpaceFictionBook extends FictionBook{
	public void doThings() {
		read(); //5
		//new Book().read(); //6
		//new FictionBook().read(); //7
		new SpaceFictionBook().read(); //8
	}
}
class Reader{
	public void doThings() {
		Book b = new Book();
		//b.read(); //9
		
		FictionBook fb = new FictionBook();
		//fb.read(); //10
	}
}

/* 패키지 밖에 있는 부 클래스 안에서는
 * protected 멤버를 a라인과 5라인 처럼 직접 접근 하라;
 * 또는 2라인과 8라인 처럼 현재 부 클래스의 참조를 사용하라
 */