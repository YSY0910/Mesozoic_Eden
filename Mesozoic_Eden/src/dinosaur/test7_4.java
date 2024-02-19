package dinosaur;

class Enclosure{
	private Dinosaur[] dinosaur = new Dinosaur[5];
	private int Safetyscore;
	private int SafetyHold = 6;
	
	public int getSafetyHold() {
		return SafetyHold;
	}

	public int getSafetyCheck() {
		return Safetyscore;
	}
	
	public void setSafetyscore(int aSafetyscore) {
		Safetyscore = aSafetyscore;
	}

	public void CheckSafe() {
		if(Safetyscore > SafetyHold) {
			System.out.println("안전한 상태입니다.");
		}else System.out.println("위험한 상태입니다. 신속히 점검하세요.");
	}
	
    public void addDinosaur(Dinosaur newDinosaur) {
        for (int i = 0; i < dinosaur.length; i++) {
            if (dinosaur[i] == null) {
            	dinosaur[i] = newDinosaur;
                System.out.println(newDinosaur.getName() + "이(가) 우리에 추가되었습니다.");
                return;
            }
        }
        System.out.println("더 이상 공룡을 추가할 수 없습니다. 우리에 남은 공간이 없습니다.");
    }
    
    
    public void removeDinosaur(String name) {
        for (int i = 0; i < dinosaur.length; i++) {
            if (dinosaur[i] != null && dinosaur[i].getName().equals(name)) {
                System.out.println(dinosaur[i].getName() + "이(가) 우리에서 제거되었습니다.");
                dinosaur[i] = null;
                return;
            }
        }
        System.out.println(name + "이(가) 우리에 존재하지 않습니다.");
    }
    
    public void displayEnclosureStatus() {
        System.out.println("현재 우리의 상태:");
        for (Dinosaur dino : dinosaur) {
            if (dino != null) {
                System.out.println(dino.getName() + " " + dino.getSpecies() + " " + dino.getAge() + "살");
            }else {System.out.println("우리가 비었습니다.");
            }
        }
        System.out.println("안전 점검 상태: " + Safetyscore + " / 안전 임계점: " + SafetyHold);
        if (Safetyscore > SafetyHold) {
            System.out.println("안전한 상태입니다.");
        } else {
            System.out.println("위험한 상태입니다. 신속히 점검하세요.");
        }
    }
 
}

public class test7_4 {
	public static void main(String[] args) {
	
	Enclosure enclosure1 = new Enclosure();
	Enclosure enclosure2 = new Enclosure();
	Enclosure enclosure3 = new Enclosure();
	Enclosure enclosure4 = new Enclosure();
	Enclosure enclosure5 = new Enclosure();
	
	
	enclosure1.addDinosaur(new Dinosaur("티노", 10, "티노01"));
	enclosure2.addDinosaur(new Dinosaur("알로", 10, "알로01"));
	enclosure3.addDinosaur(new Dinosaur("랩터", 10, "랩터01"));
	enclosure4.addDinosaur(new Dinosaur("키노", 10, "키노01"));
	enclosure5.addDinosaur(new Dinosaur("주노", 10, "주노01"));
	enclosure1.setSafetyscore(8);
	enclosure1.displayEnclosureStatus();
	enclosure1.removeDinosaur("키노");
	enclosure1.addDinosaur(new Dinosaur("주드노", 15, "주드노01"));
	enclosure1.displayEnclosureStatus();
	
	}
}
