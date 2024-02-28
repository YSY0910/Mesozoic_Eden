package exception;
import java.io.FileReader;
import java.io.IOException;

public class T4BldTest {
	public static void main(String[]args) {
		try(FileReader filereader = new FileReader
		("C:\\Users\\dw-503\\git\\Mesozoic_Eden\\Mesozoic_Eden\\src\\exception\\input.txt")){
			int character;
			StringBuilder content = new StringBuilder();
			while((character = filereader.read()) != -1) {
				content.append((char) character);
			}
			System.out.println(content);
		}catch(IOException e) {
			System.out.println("Oops: " + e.getMessage());
		}
	}
}
