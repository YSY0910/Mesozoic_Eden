package exception;
import java.io.*;

public class T1ReadFileExample {
	public static void main(String[]args) {
		FileReader reader = null;
		try {
			reader = new FileReader("src\\exception\\input.txt");
			int character;
			
			while((character = reader.read())  != -1 ) {
				System.out.print((char) character);
			}
			reader.close();
		}catch(FileNotFoundException e) {
			System.out.println("Not found: " + e.getMessage());
		}catch(IOException e) {
			System.out.println("IO error: " + e.getMessage());
		}finally {
			if(reader != null) {
				try {
					reader.close();
					System.out.println("FileReader closed successfully");
				}catch(IOException e) {
					System.out.println("Err closing: " + e.getMessage());

				}
			}
		}
	}
}
