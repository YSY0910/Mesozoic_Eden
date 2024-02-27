package Dinopark;

class SafeTest{ // 간단 안전 테스트
	private double Safetyscore;
	private int SafetyHold = 7; // 불변값.
	
	public int getSafetyHold() {
		return SafetyHold;
	}

	public double getSafetyCheck() {
		return Safetyscore;
	}
	
	public void setSafetyScore(double aSafetyscore) {
		Safetyscore = aSafetyscore;
	}

	public void checkSafe() {
		if(Safetyscore > SafetyHold) {
			System.out.println("안전한 상태입니다.");
		}else System.out.println("주의가 필요합니다. 안전점검이 필요합니다.");
	}
}
