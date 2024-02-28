package DinoException;

import java.io.FileReader;
import java.io.IOException;

public class P4{

	public static void main(String[] args) {
		
		try(FileReader filereader = new FileReader("src\\DinoException\\DinoDiet.txt")){
			int ad;
			StringBuilder content = new StringBuilder();
			while((ad = filereader.read()) != -1) {
				content.append((char) ad);
			}
		System.out.println(content.toString());

	}catch(IOException a) {
		System.err.println("파일을 찾을 수 없습니다. " + a.getMessage());
		}
	}
}

