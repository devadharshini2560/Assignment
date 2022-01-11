import java.util.Scanner;
public class PrimeNumber
{
    public static void main(String args[])
    {       
        int j, i, flag = 0;
        System.out.println("Enter any number :");
        Scanner s = new Scanner(System.in);
        i = s.nextInt();
        for( j = 2; j < i; j++)
        {
            if(i % j == 0)
            {
                flag = 0;
                break;
            }
            else
            {
                flag = 1;
            }
         }
         if(flag == 1)
         {
             System.out.println("The entered number is a prime number.");
         }
         else
         {
             System.out.println("The entered number is not a prime number.");
         }           
    }
}