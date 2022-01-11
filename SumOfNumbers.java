import java.util.Scanner;
public class SumOfNumbers {

	public static void main(String[] args) {

			int Num, i, sum=0;
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Sum from : ");
			i= s.nextInt();//i = 1
			
			System.out.println("Sum up to: ");
			Num= s.nextInt();// Num = 100
			
			while(i<=Num)
			{
				sum= sum + i;
				
				i++;
			}
			
			System.out.println("Sum of First 100 number is = "+ sum);
			
		

	}

}
