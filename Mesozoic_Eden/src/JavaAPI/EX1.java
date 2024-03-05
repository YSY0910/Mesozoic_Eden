package JavaAPI;
import java.util.*;
import java.io.*;


public class EX1 {


	
	public static void usingKeyboard() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		if(sc.hasNextInt()) {
			int age = sc.nextInt();
			System.out.println(age);
		}
		else if(sc.hasNext()) {
			String string = sc.next();
			System.out.println(string + " >> This is String type.");
		}
		else if(sc.hasNextDouble()) {
			double double1 = sc.nextDouble();
			System.out.println(double1 + " >> This is Double Type.");
		}
		System.out.println("End.");
		sc.close();
	}
	
	public static void usingKeyboardExtra() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		//System.out.println(sc.next());
		System.out.println(sc.nextLine());
		//newline 문자가 구분자로 사용됐다.
		//nextLine()은 한 줄을 읽고, next()는 단어를 읽는다.
	}
	
    public static void usingFile() {
    	System.out.println(System.getProperty("user.dir"));
        try (Scanner sc = new Scanner(new File(System.getProperty("user.dir") + "\\src\\Sample.txt"))) {
            if (sc.hasNextInt()) {
                int age = sc.nextInt();
                System.out.println(age);
            }
            if (sc.hasNextInt()) {
                int age = sc.nextInt();
                System.out.println(age);
            }
            if (sc.hasNextInt()) {
                int age = sc.nextInt();
                System.out.println(age);
            }
        } catch (FileNotFoundException a) {
            a.printStackTrace();
        }
        System.out.println("프로그램 종료");
    }
	
    public static void usingString() {
    	String input = "Maaike delim vandelin Putten delim 22";
    	Scanner sc = new Scanner(input).useDelimiter("\\s*delim\\s*");
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
    	sc.close();
    }
    
    public static void StringTest() {
    	String s1 = "abc";
    	String s2 = "abc";
    	System.out.println(s1 == s2);
    	String s3 = new String("abc");
    	System.out.println(s1 == s3);
    	System.out.println(s1.equals(s2));
    	System.out.println(s1.equals(s3));
    	s3 = s3.intern();
    	System.out.println(s1 == s3);
    	System.out.println(s1 + " " + s2 + " " + s3);
    }
    
    public static void howManyObjectsString() {
    	String s = "The ";
    	s += "quick ";
    	System.out.println(s);
    	s.concat("Brown fox"); // 값을 추가 했으나 s에 할당 하지 않아 출력 되지 않음.
    	System.out.println(s);
    	s = s.concat("Brown fox");
    	System.out.println(s);
    }
    
    public static void howManyObjectsSB() {
        StringBuilder sb = new StringBuilder("The  ");
        sb.append("quick  ");                
        System.out.println(sb);            // The quick
        sb.append("brown fox");
        System.out.println(sb);            // The quick brown fox
 }
    
	public static void main(String[] args) {
		
	}
}


