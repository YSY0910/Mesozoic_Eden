package JavaAPI;

public class P5 {

	public static void main(String[] args) {
		
		String[] dinosaursNames = {"티라노", "스테고", "랩터", "안길", "알로", };
		
		StringBuilder fullNames = new StringBuilder();
		
		for(String name : dinosaursNames) {
			fullNames.append(name);
			fullNames.append(" ");
		}

		String finalDinoName = fullNames.toString();
		
		System.out.println(finalDinoName);
	}

}
