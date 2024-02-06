package pack01;

public class test001 {
	public static void main(String[]args) {
		
		int x = 3;
		x++;
		int y = 0;
		{

			y++;
			x++;
		}
		
		x++;
		y++;
		
		System.out.println(x); 		System.out.println(y);
		
	}
}
