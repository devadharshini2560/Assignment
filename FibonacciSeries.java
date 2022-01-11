import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to specify terms in fibonacci series :");
		int n = sc.nextInt();
		int n1 = 0, n2 = 1;
		int output;
		System.out.println(n1 + " " + n2 + " ");
		for(int index = 2 ; index < n ; index++) {
			output = n1 + n2;
			System.out.println(output + " ");
			n1 = n2;
			n2 = output;
		}
    }
}
