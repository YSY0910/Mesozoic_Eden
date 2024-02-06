package dinosaur;

public class test3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dino = "T-rex";
		
		switch(dino) {
		case "T-rex":
		System.out.println("티라노사우루스는 거대한 육식 공룡이므로 주의해야 합니다.\n작업자도 관람객도 '고기'라는 것을 인식합시다.");
		break;
		case "Velocriraptor":
		System.out.println("랩터종은 작지만 무리지어 다닙니다.\n다굴에는 장사가 없으므로 작업자는 3인 1조로 작업하시기 바랍니다.");
		break;
		default:
		System.out.println("정보 갱신 중...");
		break;
		}
	}

}
