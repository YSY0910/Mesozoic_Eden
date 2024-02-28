package exception;
import java.io.*;

public class T5BufferedReader {

    public static void main(String[] args) {

        try (FileReader filereader = new FileReader("src\\exception\\input.txt");
             BufferedReader bufferedreader = new BufferedReader(filereader);
             FileWriter filewriter = new FileWriter("output.txt");
             BufferedWriter bufferedwriter = new BufferedWriter(filewriter)) {

            String line;
            while ((line = bufferedreader.readLine()) != null) {
                String uppercaseLine = line.toUpperCase();
                bufferedwriter.write(uppercaseLine);
                bufferedwriter.newLine();
            }

        }
        catch (IOException e) 
        {
            System.out.println("오류 발생: " + e.getMessage());
        }
    }
}
