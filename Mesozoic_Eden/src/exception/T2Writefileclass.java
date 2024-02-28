package exception;
import java.io.FileWriter;
import java.io.IOException;

public class T2Writefileclass {
	public static void main(String[]args) {
		try {
			FileWriter writer = new FileWriter("output.txt");
			String content = "I can wrtie!";
			writer.write(content);
			writer.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		}
}
