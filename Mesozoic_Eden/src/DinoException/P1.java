package DinoException;
import java.io.*;

public class P1 {
	public static void main(String[]args) {
		try {
		FileReader aa = new FileReader("src\\DinoException\\Dinosaur.txt");
		int i ;
		while((i = aa.read()) != -1) {
			System.out.println((char) i);
		}
		aa.close();
		}catch(FileNotFoundException d) {
			System.err.println("파일 어디 있어?");
		}catch(IOException d) {
			System.out.println("뭐가 잘못 된거 같은데?");
		}
	}
}

