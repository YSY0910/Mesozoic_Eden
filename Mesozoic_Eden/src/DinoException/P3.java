package DinoException;

public class P3 {
	private String name;
	private int weight;
	
	P3(String name, int weight){
        this.name = name;
        this.weight = weight;
	}
	
	public void DinoHealthCheck(String name, int weight) {
        try {
            if (weight <= 0) {
                throw new IllegalArgumentException("공룡의 체중은 0이나 그 이하가 될 수 없다.");
            }
            else if(weight < 1500) {
                throw new IllegalArgumentException("공룡이 저체중 상태이다.");
            }
            else if(weight > 100000){
                throw new IllegalArgumentException("공룡의 무게가 너무 높다.");
            }
            else {
            	this.name = name;
                this.weight = weight;
                System.out.println("공룡 체중 확인 완료: 이름: " + name + " 체중: " + weight + "kg");
            }
        } catch (IllegalArgumentException a) {
            System.err.println("!!! 예외 발생: " + a.getMessage() + " !!!");
        }finally {
            System.out.println("---공룡 체중 검사 완료---");
        }
	}
	
	public static void main(String[]args) {
		P3 dino = new P3("예시", 1000);
		dino.DinoHealthCheck("건강이1", 4500);
		dino.DinoHealthCheck("무거움", 125000);
		dino.DinoHealthCheck("건강이2", 9000);
		dino.DinoHealthCheck("약함이", 800);
		dino.DinoHealthCheck("없는애", 0);
	}
}
