import java.util.Scanner;
public class CheckForOdd_Even 
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = s.nextInt();
        if(n % 2 == 0)
        {
            System.out.println("The entered number is Even ");
        }
        else
        {
            System.out.println("The entered number is Odd ");
	}
    }
}
