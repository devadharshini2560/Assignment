import java.io.StringReader;
import java.util.Scanner;

public class TrafficSignal {

	public static void main(String[] args) {
		String colour;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the colour");
		colour=s.nextLine();
		switch(colour)
		{
		case "R" :
		case "r" :
		case "red":
			
			System.out.println("stop!");
			break;
			
		case "Y" :
		case "y" :
		case "yellow":
			
			System.out.println("ready ");
			break;
			
		case "G" :
		case "g" :
		case "green" :
		
			System.out.println("go...");
			break;
			default: 
				
				System.out.println("invalid colour");
			
		}
	}
	
	

}
