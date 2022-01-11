import java.util.Scanner;
public class NumberSwaping {
	public static void main(String[] args) {
		  System.out.println("Enter The Value Of x & y");
		  Scanner s = new Scanner(System.in);
		  int x = s.nextInt();
		  int y = s.nextInt();
		  
		  System.out.println("Before Swaping Number x="+x+" y="+y);
		  x = x + y;
		  y = x - y;
		  x = x - y;
		  
		  System.out.println("After Swaping Number x="+x+" y="+y);

		 }


}
