package DinoException;

public class P5 {
	private String name;
	private int healthScore;
	P5(String name, int healthScore){
		this.name = name;
		this.healthScore = healthScore;
	}
	public void CriticalHealthException(String name, int healthScore) {
        try {
            if(healthScore < 30) {
            	throw new IllegalArgumentException("공룡이 많이 아픕니다.");
            }
            else {
            	this.name = name;
                this.healthScore = healthScore;
                System.out.println("공룡 상태는 괜찮습니다. 이름: " + name + " 체중: " + healthScore + "점");
            }
        } catch (IllegalArgumentException c) {
            System.err.println("!!! 건강 이상 !!! : " + c.getMessage());
        }finally {
            System.out.println("---공룡 건강 검사 완료---");
        }
	}
	
	public static void main(String[]args) {
		P5 dino = new P5("예시", 10);
		dino.CriticalHealthException("좋음", 100);
		dino.CriticalHealthException("좋음", 90);
		dino.CriticalHealthException("좋음", 80);
		dino.CriticalHealthException("좋음", 60);
		dino.CriticalHealthException("좋음", 30);
		dino.CriticalHealthException("좋음", 25);
	}
}
