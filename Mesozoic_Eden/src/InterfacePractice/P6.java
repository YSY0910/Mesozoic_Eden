package InterfacePractice;
import java.util.*;


class Enclosure{
	private Dinosaur[] dinosaurs;
	Enclosure(int capacity){
		dinosaurs = new Dinosaur[capacity];
	}
	public void addDinosaur(Dinosaur dinosaur, int index) {
        if (index >= 0 && index < dinosaurs.length) {
            dinosaurs[index] = dinosaur;
        } else {
            System.out.println("유효하지 않은 인덱스입니다.");
        }
    }
	public void displayDinosaurs() {
		int i = 1;
        System.out.println("우리에 있는 공룡들:");
        for (Dinosaur dinosaur : dinosaurs) {
            if (dinosaur != null) {
                System.out.println(i++ + "번: "+ dinosaur.getName() + ", " + dinosaur.getAge());
            }
        }
    }
}

public class P6 {
	List<Dinosaur> list1 = new ArrayList<>();
	
	public static void main(String[]args) {
		
		Enclosure enclouse = new Enclosure(5);
		
		Dinosaur dino = new Dinosaur("Dam", 5);
		
		enclouse.addDinosaur(dino, 0);
		
		enclouse.displayDinosaurs();
	}
}
